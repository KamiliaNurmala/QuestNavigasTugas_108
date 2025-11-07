package com.example.praktikum7.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.praktikum7.R

@Composable
fun FormScreen(
    onBackButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }
    var textStatus by remember { mutableStateOf("") }

    var showDialog by remember { mutableStateOf(false) }

    val gender: List<String> = listOf(
        stringResource(R.string.laki_laki),
        stringResource(R.string.perempuan)
    )

    val statusPerkawinan: List<String> = listOf(
        stringResource(R.string.janda),
        stringResource(R.string.lajang),
        stringResource(R.string.duda)
    )

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
                text = stringResource(R.string.formulir_pendaftaran),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_top)))

        // Nama Lengkap
        Text(
            text = stringResource(R.string.nama_lengkap),
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = dimensionResource(R.dimen.padding_large),
                    bottom = dimensionResource(R.dimen.padding_small)
                )
        )
        OutlinedTextField(
            value = textNama,
            onValueChange = { textNama = it },
            placeholder = { Text(stringResource(R.string.isian_nama)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(R.dimen.padding_large)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.text_field_corner)),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White
            )
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_top)))

        // Jenis Kelamin
        Text(
            text = stringResource(R.string.jenis_kelamin),
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = dimensionResource(R.dimen.padding_large),
                    bottom = dimensionResource(R.dimen.padding_small)
                )
        )
        Column(modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.padding_large))) {
            gender.forEach { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = textJK == item,
                            onClick = { textJK = item }
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = textJK == item,
                        onClick = { textJK = item }
                    )
                    Text(text = item)
                }
            }
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_top)))

        // Status Perkawinan
        Text(
            text = stringResource(R.string.status_perkawinan),
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = dimensionResource(R.dimen.padding_large),
                    bottom = dimensionResource(R.dimen.padding_small)
                )
        )
        Column(modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.padding_large))) {
            statusPerkawinan.forEach { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .selectable(
                            selected = textStatus == item,
                            onClick = { textStatus = item }
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(
                        selected = textStatus == item,
                        onClick = { textStatus = item }
                    )
                    Text(text = item)
                }
            }
        }

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_top)))

        // Alamat
        Text(
            text = stringResource(R.string.alamat),
            fontSize = 12.sp,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = dimensionResource(R.dimen.padding_large),
                    bottom = dimensionResource(R.dimen.padding_small)
                )
        )
        OutlinedTextField(
            value = textAlamat,
            onValueChange = { textAlamat = it },
            placeholder = { Text(stringResource(R.string.placeholder_alamat)) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = dimensionResource(R.dimen.padding_large)),
            shape = RoundedCornerShape(dimensionResource(R.dimen.text_field_corner)),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                focusedContainerColor = Color.White
            )
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.spacing_large)))
    }
}