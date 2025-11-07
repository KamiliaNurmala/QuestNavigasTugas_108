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
            text = stringResource(R.string.selamat_datang),
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = stringResource(R.string.card_ist),
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )

        Text(
            text = stringResource(R.string.mobile_app),
            fontSize = 14.sp,
            color = Color(0xFF6A1B9A)
        )

        Text(
            text = stringResource(R.string.tahun),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6A1B9A)
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_xxlarge)))

        Text(
            text = stringResource(R.string.nama_mahasiswa),
            fontSize = 16.sp,
            color = Color(0xFF6A1B9A)
        )

        Text(
            text = stringResource(R.string.nim),
            fontSize = 14.sp,
            color = Color(0xFF6A1B9A)
        )
    }
}