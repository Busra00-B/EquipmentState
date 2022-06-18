package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember

object EquipmentData {
    val equipmentSamples = listOf(
        Equipment(
            "Sara Stedy",
            "X.2.51"
        ),
        Equipment(
            "Gulvlift",
            "X.2.54"
        ),
        Equipment(
            "Stålift",
            "X.1.50"
        )
    )
}

