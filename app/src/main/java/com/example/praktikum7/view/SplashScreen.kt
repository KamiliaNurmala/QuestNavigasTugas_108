package com.example.praktikum7.view

import android.window.SplashScreen

@Composable
fun SplashScreen(
    onNextButton: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE1BEE7)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Selamat Datang",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "CARD-IST",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )

        Text(
            text = "MOBILE APP",
            fontSize = 14.sp,
            color = Color(0xFF6A1B9A)
        )

        Text(
            text = "2025",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )
    }
}