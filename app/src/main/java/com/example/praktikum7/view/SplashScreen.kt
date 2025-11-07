package com.example.praktikum7.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.praktikum7.R

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

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_large)))

        Image(
            painter = painterResource(id = R.drawable.download),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))


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

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_xlarge)))

        Button(
            onClick = onNextButton,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(R.dimen.padding_large))
                .height(dimensionResource(R.dimen.button_height)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF9C27B0)
            )
        ) {
            Text(
                text = stringResource(R.string.submit),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}