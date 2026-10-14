package com.example.mad_practical_5_24012011028

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(context: Context) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(context, navController = navController)
        }
        composable("register") {
            RegisterScreen(context, navController = navController)
        }
    }
}

@Composable
@Preview(showBackground = true)
fun AppNavigationPreview() {

}