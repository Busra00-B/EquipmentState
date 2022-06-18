package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun EquipmentScreen(
    modifier: Modifier = Modifier,
    equipmentViewModel: EquipmentViewModel = viewModel(),
) {
    EquipmentCardList(
        list = equipmentViewModel.equipmentRepository.equipment
    )



}



