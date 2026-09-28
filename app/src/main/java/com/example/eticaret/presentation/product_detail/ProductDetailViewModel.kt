package com.example.eticaret.presentation.product_detail

import androidx.lifecycle.SavedStateHandle
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
class ProductDetailViewModel @Inject constructor(
    private val repository: ProductRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _state = MutableStateFlow(ProductDetailState())
    val state: StateFlow<ProductDetailState> = _state.asStateFlow()

    init {
        savedStateHandle.get<String>("productId")?.toIntOrNull()?.let { productId ->
            getProductDetail(productId)
        }
    }

    fun getProductDetail(id: Int) {
        viewModelScope.launch {
            _state.value = ProductDetailState(isLoading = true)
            try {
                val product = repository.getProductById(id)
                _state.value = ProductDetailState(product = product)
            } catch (e: Exception) {
                _state.value = ProductDetailState(error = e.localizedMessage ?: "Bilinmeyen bir hata oluştu. Lütfen bağlantınızı kontrol edin.")
            }
        }
    }
}
