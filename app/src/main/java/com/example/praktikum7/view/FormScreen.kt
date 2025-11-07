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
    }
}