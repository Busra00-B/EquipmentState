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


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(
            route = Screen.ValgteUdstyrScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = ""
                    nullable = true
                }
            )
        )
        { entry ->
            ValgteUdstyr(name = entry.arguments?.getString("name"))

        }
        composable(
            route = Screen.SessionScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "Kimya"
                    nullable = true
                }
            )
        )
        { entry ->
            SessionScreen(name = entry.arguments?.getString("name"))
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
                navController.navigate(Screen.ValgteUdstyrScreen.withArgs(text))
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Søg")
        }


    }
}

@Composable
fun String?.ValgteUdstyr(navController: NavController) {


    /*
    Column(
        /*contentAlignment = Alignment.Center,
        
         */
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "", modifier = Modifier.size(40.dp))

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
                Button(onClick = { }) {
                    Text(text = "SS3 i lokale 111")
                }
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(onClick = { }) {
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
                Button(onClick = { }) {
                    Text(text = "SS1 i lokale 113")
                }
            }
        }

        Column {
            Row {
                Spacer(modifier = Modifier.width(40.dp))
                Button(onClick = { }) {
                    Text(text = "SS3 i lokale 106")
                }

            }
        }
    }

     */


}

@Composable
fun SessionScreen(name: String?) {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Text(text = "vi er ommet til næste side")
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
}




