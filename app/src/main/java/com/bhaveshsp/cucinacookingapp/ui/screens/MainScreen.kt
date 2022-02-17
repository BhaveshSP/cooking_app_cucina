package com.bhaveshsp.cucinacookingapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.bhaveshsp.cucinacookingapp.Screen
import kotlinx.coroutines.delay


@Composable
fun MainScreen(
    painter : Painter,
    contentDescription : String,
    title : String,
    navController: NavController,
    modifier: Modifier = Modifier
) {

    ConstraintLayout(
        modifier = modifier.fillMaxSize(),
    ){
        LaunchedEffect(key1 = true){
            delay(3000)
            navController.navigate(Screen.HomeScreen.route)
        }
        val (image,text,progress) = createRefs()
        Image(painter = painter,
            contentDescription = contentDescription,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize().constrainAs(image){
                centerTo(parent)
            }
        )
        Text(text = title,
            style = TextStyle(
                color = Color.White,
                fontSize = 48.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp).constrainAs(text){
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)

                }
        )
        CircularProgressIndicator(modifier = Modifier
            .width(64.dp)
            .height(64.dp)
            .padding(48.dp)
            .constrainAs(progress){
                bottom.linkTo(parent.bottom)
                centerHorizontallyTo(parent)
            },
            color = MaterialTheme.colors.primary
        )
    }
}