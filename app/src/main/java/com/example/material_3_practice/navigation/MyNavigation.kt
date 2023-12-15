package com.example.material_3_practice.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.material_3_practice.screen.BottomNavigationScreen
import com.example.material_3_practice.screen.Screens
import com.example.material_3_practice.screen.button.ButtonScreen
import com.example.material_3_practice.screen.home.HomeScreen
import com.example.material_3_practice.screen.calculator.CalculatorScreen
import com.example.material_3_practice.screen.text.TextScreen
import com.example.material_3_practice.screen.topAppBar.TopBarScreen

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    val bottomNavController = rememberNavController()
    NavHost(navController = navController, startDestination = Screens.Home.name) {
        composable(Screens.Home.name) {
            HomeScreen(navController = navController, bottomNavController)
        }
        composable(Screens.TextScreen.name) {
            TextScreen(navController = navController)
        }
        composable(Screens.TopBarScreen.name) {
            TopBarScreen(navController = navController)
        }
        composable(Screens.ButtonScreen.name){
            ButtonScreen(navController = navController)
        }
        composable(Screens.BottomNavigationScreen.name){
            BottomNavigationScreen(navController = navController)
        }
        composable(Screens.CalculatorScreen.name) {
            CalculatorScreen(
                modifier = Modifier.padding(8.dp)
            )
        }
    }


}