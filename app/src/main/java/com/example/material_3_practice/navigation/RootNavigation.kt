package com.example.material_3_practice.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.material_3_practice.screen.BottomNavigationScreen

@Composable
fun RootNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = Graph.MAIN){
            myNavigation(navController = navController)
        composable(route = Graph.BOTTOM){
            BottomNavigationScreen()
        }
    }
}

object Graph{
    const val ROOT = "root_graph"
    const val MAIN = "main_graph"
    const val BOTTOM = "bottom_graph"
}