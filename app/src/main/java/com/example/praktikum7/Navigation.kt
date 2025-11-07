package com.example.praktikum7

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.praktikum7.view.SplashScreen
import com.example.praktikum7.view.ListScreen
import com.example.praktikum7.view.FormScreen

enum class NavigationRoute { Splash, List, Form }

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = NavigationRoute.Splash.name,
        modifier = modifier
    ) {
        composable(route = NavigationRoute.Splash.name) {
            SplashScreen(onNextButton = { navController.navigate(NavigationRoute.List.name) })
        }
        composable(route = NavigationRoute.List.name) {
            ListScreen(
                onBackButton = { navController.popBackStack() },
                onNextButton = { navController.navigate(NavigationRoute.Form.name) }
            )
        }
        composable(route = NavigationRoute.Form.name) {
            FormScreen(onBackButton = { navController.popBackStack() })
        }
    }
}