package com.bhaveshsp.cucinacookingapp.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier.fillMaxSize()) {
        Text(text = "Home Screen")
        var searchQuery by remember {
            mutableStateOf("")
        }
        TextField(value = searchQuery, onValueChange = { searchQuery = it })
    }
}