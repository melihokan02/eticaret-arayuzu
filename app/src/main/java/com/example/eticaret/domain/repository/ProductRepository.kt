package com.example.eticaret.domain.repository

import com.example.eticaret.domain.model.Product

interface ProductRepository {
    suspend fun getProducts(): List<Product>
    suspend fun getProductById(id: Int): Product
}
