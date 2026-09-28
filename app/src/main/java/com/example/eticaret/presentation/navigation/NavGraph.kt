package com.example.eticaret.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.eticaret.presentation.product_detail.ProductDetailScreen
import com.example.eticaret.presentation.product_list.ProductListScreen

@Composable
fun NavGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.ProductList.route
    ) {
        composable(route = Screen.ProductList.route) {
            ProductListScreen(
                onNavigateToDetail = { productId ->
                    navController.navigate("${Screen.ProductDetail.route}/$productId")
                }
            )
        }
        composable(
            route = "${Screen.ProductDetail.route}/{productId}",
            arguments = listOf(
                navArgument("productId") { type = NavType.StringType }
            )
        ) {
            ProductDetailScreen()
        }
    }
}
