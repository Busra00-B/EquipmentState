package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun EquipmentScreen(
    modifier: Modifier = Modifier,
    equipmentViewModel: EquipmentViewModel = viewModel(),
) {
    /*
    Column {
        Row {
            Text("${equipmentViewModel.equipmentRepository.equipment.size}")
            Spacer(modifier = Modifier.width(40.dp))
            Button(onClick = { equipmentViewModel.addEquipment() }) {
                Text(text = "Equipment")
            }
        }

     */
        /*
//koden til valgteudstyr starter herfra
        Column {
            //kode til valgte udstyr
            Row(modifier = Modifier.padding(all = 8.dp)) {
                Text(text = "Valgte udstyr")
            }
        }
        Column() {
            Row() {

                //kode efter onclick skal også ændres men ved ikke helt hvad den skal ændres til det er nok noget som kan hente fra database
                Button(onClick = { }) {
                    //der skal nok være en kode som henter fra database
                    Spacer(modifier = Modifier.width(40.dp))
                    Image(
                        painter = painterResource((R.drawable.sarastedy)),
                        contentDescription = "Equipment",
                        modifier = Modifier
                            .size(50.dp)

                    )
                    Text(text = "Sara Stedy")

                }
            }
        }






        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Text(text = "LEDIGE ENHEDER:")
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(onClick = {  }) {
                    Text(text = "SS3 i lokale 111")
                }
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(onClick = {  }) {
                    Text(text = "SS3 i lokale 101")
                }

            }
        }
        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Text(text = "OPTAGET ENDHEDER:")
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(onClick = {  }) {
                    Text(text = "SS1 i lokale 113")
                }
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(onClick = {  }) {
                    Text(text = "SS3 i lokale 106")
                }

            }
        }



         */


        EquipmentCardList(
            list = equipmentViewModel.equipmentRepository.equipment
        )


    }



