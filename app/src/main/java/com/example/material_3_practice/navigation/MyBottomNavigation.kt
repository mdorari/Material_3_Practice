package com.example.material_3_practice.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.material_3_practice.screen.Screens
import com.example.material_3_practice.screen.navScreens.NavOne
import com.example.material_3_practice.screen.navScreens.NavThree
import com.example.material_3_practice.screen.navScreens.NavTwo

@Composable
fun MyBottomNavigation(modifier: Modifier,navController: NavHostController) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Screens.BottomNavigationScreen.name
    ){
        composable(Screens.NavOne.name){
            NavOne(navController = navController)
        }
        composable(Screens.NavTwo.name){
            NavTwo(navController = navController)
        }
        composable(Screens.NavThree.name){
            NavThree(navController = navController)
        }
    }
}