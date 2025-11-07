package com.example.praktikum7.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.praktikum7.R

@Composable
fun ListScreen(
    onBackButton: () -> Unit,
    onNextButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFE1BEE7)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFD8A7E8))
                .padding(vertical = dimensionResource(R.dimen.padding_top)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.list_daftar_peserta),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_top)))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(R.dimen.padding_medium)),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = RoundedCornerShape(dimensionResource(R.dimen.card_corner))
        ) {
            Column(
                modifier = Modifier.padding(dimensionResource(R.dimen.padding_card))
            ) {
                DataField(label = stringResource(R.string.nama_lengkap), value = stringResource(R.string.nama_mahasiswa))
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_small)))
                DataField(label = stringResource(R.string.jenis_kelamin), value = stringResource(R.string.perempuan))
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_small)))
                DataField(label = stringResource(R.string.status_perkawinan), value = stringResource(R.string.lajang))
                Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_small)))
                DataField(label = stringResource(R.string.alamat), value = "Sleman")
            }
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_top)))

// Button Beranda
        Button(
            onClick = onBackButton,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(R.dimen.padding_large))
                .height(dimensionResource(R.dimen.button_height)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD8A7E8)
            )
        ) {
            Text(
                text = stringResource(R.string.beranda),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_medium)))

        // Button Formulir Pendaftaran
        Button(
            onClick = onNextButton,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(R.dimen.padding_large))
                .height(dimensionResource(R.dimen.button_height)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.button_corner)),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFD8A7E8)
            )
        ) {
            Text(
                text = stringResource(R.string.formulir_pendaftaran),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}

@Composable
fun DataField(label: String, value: String) {
    Column {
        Text(
            text = label,
            fontSize = 12.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = value,
            fontSize = 16.sp,
            color = Color.Black,
            fontWeight = FontWeight.Normal
        )
    }
}
