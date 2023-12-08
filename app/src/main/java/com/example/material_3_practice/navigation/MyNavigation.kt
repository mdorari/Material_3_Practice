package com.example.material_3_practice.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.material_3_practice.screen.home.HomeScreen
import com.example.material_3_practice.screen.Screens
import com.example.material_3_practice.screen.text.TextScreen
import com.example.material_3_practice.screen.topAppBar.TopBarScreen

@Composable
fun MyNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screens.Home.name) {
        composable(Screens.Home.name) {
            HomeScreen(navController = navController)
        }
        composable(Screens.TextScreen.name) {
            TextScreen(navController = navController)
        }
        composable(Screens.TopBarScreen.name){
            TopBarScreen(navController = navController)
        }
    }
}