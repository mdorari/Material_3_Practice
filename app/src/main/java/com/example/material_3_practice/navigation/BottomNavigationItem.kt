package com.example.material_3_practice.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.material_3_practice.screen.Screens

data class BottomNavigationItem(
    val title: String,
    val route:String,
    val selectedItem: ImageVector,
    val unselectedItem: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)

fun getItems(): List<BottomNavigationItem> {
    return listOf(
        BottomNavigationItem(
            title = "Home",
            route = Screens.Home.name,
            selectedItem = Icons.Filled.Home,
            unselectedItem = Icons.Outlined.Home,
            hasNews = false,
        ),
        BottomNavigationItem(
            title = "Chat",
            route = Screens.TextScreen.name,
            selectedItem = Icons.Filled.Email,
            unselectedItem = Icons.Outlined.Email,
            hasNews = false,
            badgeCount = 45
        ),
        BottomNavigationItem(
            title = "TopBarScreen",
            route = Screens.TopBarScreen.name,
            selectedItem = Icons.Filled.Settings,
            unselectedItem = Icons.Outlined.Settings,
            hasNews = true,
        )
    )
}
