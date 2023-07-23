package com.example.codigotest1.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.codigotest1.ui.view.CreateAccountScreen
import com.example.codigotest1.ui.view.WelcomeScreen

@Composable
fun NavGraph(startDestination: String = "welcome_screen") {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable("welcome_screen") {
            WelcomeScreen( navController = navController)
        }
        composable("create_account_screen") {
            CreateAccountScreen(navController = navController)
        }
    }
}