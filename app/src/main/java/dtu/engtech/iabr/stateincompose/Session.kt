package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import dtu.engtech.iabr.stateincompose.ui.theme.Purple500

/*
class Session {

    @Composable
    fun SessionScreen(navController: NavController) {

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        ) {
            Row(modifier = Modifier.padding(all = 8.dp)) {

                Text(text = "SESSION", fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(40.dp))

            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
            ) {

                Row() {
                    Text(text = "For valgt udstyr", color = Purple500)
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
            ) {
                Row() {
                    //der skal skrives en kode her som giver databasen besked på at udstyret nu er opdateret.
                    Button(onClick = {})
                    {
                        Text(text = "START SESSION")
                    }
                }
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
            ) {
                Row() {

                    Button(onClick = {}) {
                        Text(text = "STOP SESSION")
                        Spacer(modifier = Modifier.align(Alignment.CenterVertically))
                    }
                }
            }
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
            ) {
                Row() {
                    //kode efter onclick skal også ændres men ved ikke helt hvad den skal ændres til det er nok noget som kan hente fra database
                    Button(onClick = { navController.popBackStack() })
                    {
                        //der skal nok være en kode som henter fra database
                        Text(text = "Tilbage")
                    }


                }
            }

        }
    }
}

 */