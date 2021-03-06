package com.bhaveshsp.cucinacookingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bhaveshsp.cucinacookingapp.ui.screens.HomeScreen
import com.bhaveshsp.cucinacookingapp.ui.screens.MainScreen
import com.bhaveshsp.cucinacookingapp.ui.theme.CucinaCookingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val title = "Cucina"
            val painter = painterResource(id = R.drawable.try1)
            val contentDescription = "Background Main Image"
            val navController = rememberNavController()
            CucinaCookingAppTheme {
                NavHost(
                    navController = navController,
                    startDestination = Screen.SplashScreen.route
                ){
                    composable(route = Screen.SplashScreen.route){
                        MainScreen(
                            painter = painter,
                            contentDescription = contentDescription,
                            title = title,
                            navController = navController
                        )
                    }
                    composable(route = Screen.HomeScreen.route){
                        HomeScreen(navController = navController)
                    }
                }
            }
        }
    }
}



