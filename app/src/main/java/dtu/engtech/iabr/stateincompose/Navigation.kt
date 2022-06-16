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
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import dtu.engtech.iabr.stateincompose.ui.theme.Purple500



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
    Column(verticalArrangement = Arrangement.Center) {
        Text(text = "Find udstyr", fontWeight = FontWeight.Bold)
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
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                navController.navigate("valgtudstyr")
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Næste")
        }


    }
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









