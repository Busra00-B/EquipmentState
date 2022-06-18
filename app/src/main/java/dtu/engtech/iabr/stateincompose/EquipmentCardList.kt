package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun EquipmentCardList(
    list: List<Equipment>,
    modifier: Modifier = Modifier


) {


    //  Log.d(Constants.FIREBASETAG, "EquipmentCardList size: ${list.size}")


    LazyColumn(
    ) {
        items(
            items = list
        ) { equipment ->
            EquipmentCard(
                equipment = equipment
            )
        }

    }


}


