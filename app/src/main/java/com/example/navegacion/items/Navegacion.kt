package com.example.navegacion.Screen

import androidx.compose.runtime.*
import androidx.navigation.compose.*
import androidx.navigation.NavHostController

@Composable
fun NavigationExample() {
    val navController = rememberNavController()

    val listaNombres = remember { mutableStateListOf<String>() }
    val listaCorreos = remember { mutableStateListOf<String>() }
    val listaProfesiones = remember { mutableStateListOf<String>() }

    NavHost(navController = navController, startDestination = "screen_a") {
        composable("screen_a") {
            ScreenA(navController, listaNombres, listaCorreos, listaProfesiones)
        }
        composable("screen_b") {
            ScreenB(navController, listaNombres, listaCorreos, listaProfesiones)
        }
    }
}
