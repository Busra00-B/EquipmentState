package dtu.engtech.iabr.stateincompose

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel


class EquipmentViewModel : ViewModel() {
    //var staffRepository = StaffRepositoryMock()
    var equipmentRepository = EquipmentRepositoryFirestore()

    private var _equipment = equipmentRepository.equipment.toMutableStateList()
    val equipment: List<Equipment>
        get() = _equipment

    init {
        equipmentRepository.getEquipment()
    }

    fun addEquipment(){
        equipmentRepository.equipment.add(Equipment("Joe Tester", "V2.02"))
    }
}

