package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
/*
class ValgtUdstyr {

}

    @Composable
    fun ValgteUdstyr(navController: NavController) {


        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        ) {
            //kode til valgte udstyr

            Row {
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Valgte udstyr", fontWeight = FontWeight.Bold)

            }

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
            ) {
                Row() {

                    //kode efter onclick skal også ændres men ved ikke helt hvad den skal ændres til det er nok noget som kan hente fra database
                    Button(onClick = { }) {
                        //der skal nok være en kode som henter fra database
                        Image(
                            painter = painterResource((R.drawable.sarastedy)),
                            contentDescription = "Equipment",
                            modifier = Modifier
                                .size(40.dp)

                        )
                        Text(text = "Sara Stedy")

                    }
                }
            }

            Column {
                Row {
                    Spacer(modifier = Modifier.width(40.dp))
                    Text(text = "LEDIGE ENHEDER:", fontWeight = FontWeight.Bold)
                }
            }

            Column {
                Row {
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(onClick = { navController.navigate("session") }) {
                        Text(text = "SS3 i lokale 111")
                    }
                }
            }

            Column {
                Row {
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(
                        onClick = { navController.navigate("session") }) {
                        Text(text = "SS4 i lokale 109")
                    }
                }
            }



            Column {
                Row {
                    Spacer(modifier = Modifier.width(40.dp))
                    Text(text = "OPTAGET ENDHEDER:", fontWeight = FontWeight.Bold)
                }
            }

            Column {
                Row {
                    Spacer(modifier = Modifier.width(40.dp))
                    Button(
                        onClick = {}
                    ) {
                        Text(text = "SS1 i lokale 113", color = Color.Red)
                    }
                }
            }

            Column {
                Row {
                    Spacer(modifier = Modifier.width(40.dp))

                    Button(
                        onClick = { }
                    ) {
                        Text(text = "SS2 i lokale 106", color = Color.Red)

                    }
                }
            }
            Column() {
                Row() {
                    Button(onClick = { navController.popBackStack() })
                    {
                        //der skal nok være en kode som henter fra database
                        Text(text = "Tilbage")
                    }
                }
            }
        }


    }

     */