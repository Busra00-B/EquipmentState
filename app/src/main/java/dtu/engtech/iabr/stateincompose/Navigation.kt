package dtu.engtech.iabr.stateincompose

import androidx.compose.runtime.*
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavType
import androidx.navigation.navArgument
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable

import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.Color


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }

        composable("valgtudstyr") {
            ValgteUdstyr(navController = navController)
        }

        composable("session") {
            SessionScreen(navController = navController)
        }


    }
}


@Composable
fun MainScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    Column() {
        Text(text = "Find udstyr")
        Spacer(modifier = Modifier.height(20.dp))

    }


    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        Spacer(modifier = Modifier.height(40.dp))
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                navController.navigate("valgtudstyr")
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Søg")
        }


    }
}

@Composable
fun ValgteUdstyr(navController: NavController) {


    Column(modifier = Modifier.fillMaxWidth()) {
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
                Text(text = "OPTAGET ENDHEDER:")
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(
                    onClick = {}) {
                    Text(text = "SS1 i lokale 113", color = Color.Red)
                }
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(
                    onClick = { },
                ) {
                    Text(text = "SS2 i lokale 106", color = Color.Red)

                }
            }

        }
    }
}


@Composable
fun SessionScreen(navController: NavController) {

    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "SESSION")
        Spacer(modifier = Modifier.width(40.dp))
        Text(text = "For valgt udstyr")
    }
    Spacer(modifier = Modifier.height(40.dp))

    Column() {
        Row() {
            Button(onClick = {}) {
                Text(text = "START SESSION")
                Spacer(modifier = Modifier.width(40.dp))
                Spacer(modifier = Modifier.height(60.dp))
            }
            Column() {
                Row() {

                    Button(onClick = {}) {
                        Text(text = "STOP SESSION")
                        Spacer(modifier = Modifier.width(40.dp))
                        Spacer(modifier = Modifier.height(60.dp))
                        Spacer(modifier = Modifier.align(Alignment.CenterVertically))
                    }
                }
            }
            Column() {
                Row() {
                    //kode efter onclick skal også ændres men ved ikke helt hvad den skal ændres til det er nok noget som kan hente fra database
                    Button(onClick = { navController.popBackStack() }) {
                        //der skal nok være en kode som henter fra database
                        Spacer(modifier = Modifier.width(40.dp))
                        Text(text = "Sara Stedy")
                    }


                }
            }
        }

    }
}





