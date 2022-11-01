package com.example.trial.navigation

enum class TrialScreens {
    SplashScreen,
    LoginScreen,
    HomeScreen,
    DetailsScreen,
    SearchScreen,
    UpdateScreen;

    companion object {
        fun fromRoute(route: String?): TrialScreens =
            when(route?.substringBefore("/")) {
                SplashScreen.name -> SplashScreen
                LoginScreen.name -> LoginScreen
                HomeScreen.name -> HomeScreen
                DetailsScreen.name -> DetailsScreen
                SearchScreen.name -> SearchScreen
                UpdateScreen.name -> UpdateScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route is not recognised")
            }
    }
}