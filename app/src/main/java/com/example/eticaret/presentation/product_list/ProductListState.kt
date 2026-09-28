package com.example.eticaret.presentation.product_list

import com.example.eticaret.domain.model.Product

data class ProductListState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String = ""
)
