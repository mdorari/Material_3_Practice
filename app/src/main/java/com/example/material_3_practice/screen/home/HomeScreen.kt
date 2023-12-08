package com.example.material_3_practice.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.material_3_practice.screen.Screens

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { navController.navigate(route = Screens.TextScreen.name)}
        ) {
            Text(text = "Submit")
        }
        ElevatedButton(onClick = { navController.navigate(route = Screens.TopBarScreen.name) }) {
            Icon(
                imageVector = Icons.Outlined.Add,
                contentDescription = "Add to cart",
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Add to cart")
        }
        FilledTonalButton(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Open in browser")
        }
        OutlinedButton(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Back")
        }
        TextButton(
            onClick = { /*TODO*/ }
        ) {
            Text(text = "Learn more")
        }
    }
}