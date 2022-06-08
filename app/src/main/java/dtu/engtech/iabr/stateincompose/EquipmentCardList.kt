package dtu.engtech.iabr.stateincompose

import android.util.Log
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import dtu.engtech.iabr.stateincompose.core.Constants

@Composable
fun EquipmentCardList(
    list: List<Equipment>,
    modifier: Modifier = Modifier
) {
    Log.d(Constants.FIREBASETAG, "EquipmentCardList size: ${list.size}")
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = list
        ) { staff ->
            EquipmentCard(
                equipment = staff
            )
        }
    }
}
