package com.example.eticaret.presentation.navigation

sealed class Screen(val route: String) {
    object ProductList : Screen("product_list_screen")
    object ProductDetail : Screen("product_detail_screen")
}
