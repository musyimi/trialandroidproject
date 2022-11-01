package com.example.trial.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trial.screens.TrialSplashScreen
import com.example.trial.screens.home.HomeScreen
import com.example.trial.screens.login.LoginScreen
import com.example.trial.screens.search.SearchScreen
import com.example.trial.screens.update.UpdateScreen

@Composable
fun TrialNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = TrialScreens.SplashScreen.name ) {
      composable(TrialScreens.SplashScreen.name) {
          TrialSplashScreen(navController = navController)
      }
        composable(TrialScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(TrialScreens.LoginScreen.name) {
            LoginScreen(navController = navController)
        }

        composable(TrialScreens.SearchScreen.name) {
            SearchScreen(navController = navController)
        }

        composable(TrialScreens.UpdateScreen.name) {
            UpdateScreen(navController = navController)
        }
    }
}