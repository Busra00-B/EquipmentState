package dtu.engtech.iabr.stateincompose


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

/*
sealed class ValgtUdstyr

@Composable
fun ValgteUdstyr(name: String?) {

    var text by remember {
        mutableStateOf("")
    }
    Navigation()
    val navController = rememberNavController()

    TextField(
        value = text,
        onValueChange = {
            text = it
        },
        modifier = Modifier.fillMaxWidth()
    )
//Koden til skifte side til session


/*contentAlignment = Alignment.Center,


         */
/*
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .padding(horizontal = 80.dp)
    ) {
        Text(text = "", modifier = Modifier.size(20.dp))

        //koden til valgteudstyr starter herfra


         */

    Column {
        //kode til valgte udstyr

        Row(modifier = Modifier.padding(all = 8.dp)) {
            Text(text = "Valgte udstyr")

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
                Button(onClick = {
                    Log.d("onClick", "Screen.SessionScreen.withArgs $text")
                    navController.navigate(Screen.SessionScreen.withArgs(text))
                }) {
                    Text(text = "SS3 i lokale 111")
                }
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(
                    onClick = { navController.navigate(Screen.SessionScreen.withArgs(text)) }) {
                    Text(text = "SS4 i lokale 109")
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
                Button(
                    onClick = {}) {
                    Text(text = "SS1 i lokale 113", color = Red)
                }
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(
                    onClick = { },
                ) {
                    Text(text = "SS2 i lokale 106", color = Red)

                }
            }

        }
    }
}

 */











