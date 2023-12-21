package com.example.material_3_practice.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.material_3_practice.screen.BottomNavigationScreen
import com.example.material_3_practice.screen.Screens
import com.example.material_3_practice.screen.button.ButtonScreen
import com.example.material_3_practice.screen.home.HomeScreen
import com.example.material_3_practice.screen.calculator.CalculatorScreen
import com.example.material_3_practice.screen.text.TextScreen
import com.example.material_3_practice.screen.topAppBar.TopBarScreen

//@Composable
fun NavGraphBuilder.myNavigation(navController: NavHostController) {
//    val navController = rememberNavController()
//    val bottomNavController = rememberNavController()
//    NavHost(
//        navController = navController,
//        route = "root_graph",
//        startDestination = Screens.Home.name
//    ) {
        navigation(
            route =  Graph.MAIN,
            startDestination = Screens.Home.name
        ) {
            composable(Screens.Home.name) {
//                val viewModel = it.sharedViewModel<SampleViewModel>(navController = navController)
                HomeScreen(navController = navController)
            }
            composable(Screens.TextScreen.name) {
//                val viewModel = it.sharedViewModel<SampleViewModel>(navController = navController)
                TextScreen(navController = navController)
            }
            composable(Screens.TopBarScreen.name) {
//                val viewModel = it.sharedViewModel<SampleViewModel>(navController = navController)
                TopBarScreen(navController = navController)
            }
            composable(Screens.ButtonScreen.name) {
                ButtonScreen(navController = navController)
            }
            composable(Screens.CalculatorScreen.name) {
                CalculatorScreen(
                    modifier = Modifier.padding(8.dp)
                )
            }
            composable(route = "bottom_graph"){
                BottomNavigationScreen()
            }
        }
//        BottomNavigationScreen()


//        navigation(
//            startDestination = Screens.BottomNavigationScreen.name,
//            route = "BottomNavigation"
//        ) {
//            composable(Screens.BottomNavigationScreen.name) {
//                BottomNavigationScreen(navController = navController)
//            }
//
//        }
    }
//}

//@Composable
//inline fun <reified T : ViewModel> NavBackStackEntry.sharedViewModel(navController: NavController): T {
//    val navGraphRout = destination.parent?.route ?: return viewModel()
//    val parentEntry = remember(key1 = this) {
//        navController.getBackStackEntry(navGraphRout)
//    }
//    return viewModel(parentEntry)
//}