package com.example.eticaret.presentation.product_list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.eticaret.domain.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductListViewModel @Inject constructor(
    private val repository: ProductRepository
) : ViewModel() {

    private val _state = MutableStateFlow(ProductListState())
    val state: StateFlow<ProductListState> = _state.asStateFlow()

    init {
        getProducts()
    }

    fun getProducts() {
        viewModelScope.launch {
            _state.value = ProductListState(isLoading = true)
            try {
                val products = repository.getProducts()
                _state.value = ProductListState(products = products)
            } catch (e: Exception) {
                _state.value = ProductListState(error = e.localizedMessage ?: "Bilinmeyen bir hata oluştu. Lütfen bağlantınızı kontrol edin.")
            }
        }
    }
}
