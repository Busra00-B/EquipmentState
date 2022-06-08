package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun EquipmentScreen(
    modifier: Modifier = Modifier,
    equipmentViewModel: EquipmentViewModel = viewModel(),
) {
    Column{
        Row{
            Text("${equipmentViewModel.equipmentRepository.equipment.size}")
            Spacer(modifier = Modifier.width(40.dp))
            Button(onClick = { equipmentViewModel.addEquipment() }) {
                Text(text = "Staff")
            }
        }
        EquipmentCardList(
            list = equipmentViewModel.equipmentRepository.equipment
        )
    }
}