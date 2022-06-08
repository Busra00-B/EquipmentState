package dtu.engtech.iabr.stateincompose

import androidx.compose.runtime.toMutableStateList

class EquipmentRepositoryMock: EquipmentRepository {
    var equipment = mutableListOf<Equipment>().toMutableStateList()

    override fun getEquipment() {
        equipment = EquipmentData.equipmentSamples.toMutableStateList()
    }
}

