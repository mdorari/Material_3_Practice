package com.example.material_3_practice.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.material_3_practice.screen.Screens

@Composable
fun HomeScreen(navController: NavController,bottomNavController: NavController) {
    Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { navController.navigate(route = Screens.TextScreen.name) }
        ) {
            Text(text = "Text Screen")
        }
        Button(
            onClick = { navController.navigate(route = Screens.TopBarScreen.name) }
        ) {
            Text(text = "Top bar Screen")
        }
        Button(
            onClick = { navController.navigate(route = Screens.ButtonScreen.name) }
        ) {
            Text(text = "Button Screen")
        }
        Button(
            onClick = { bottomNavController.navigate(route = Screens.BottomNavigationScreen.name) }
        ) {
            Text(text = "Bottom navigation Screen")
        }
        Button(
            onClick = { navController.navigate(route = Screens.CalculatorScreen.name) }
        ) {
            Text(text = "Calculator Screen")
        }
    }
}