package com.example.eticaret.presentation.product_detail

import com.example.eticaret.domain.model.Product

data class ProductDetailState(
    val isLoading: Boolean = false,
    val product: Product? = null,
    val error: String = ""
)
