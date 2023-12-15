package com.example.material_3_practice.screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.material_3_practice.navigation.MyNavigation

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    MyNavigation()
}