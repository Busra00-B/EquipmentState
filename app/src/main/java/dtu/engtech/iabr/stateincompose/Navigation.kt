package dtu.engtech.iabr.stateincompose

import android.widget.Space
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
import androidx.compose.material.ButtonDefaults
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.sp
import androidx.leanback.widget.SpeechRecognitionCallback
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
    /*
    var text by remember {
        mutableStateOf("")
    }
    Column() {
        Text(text = "Find udstyr", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
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
        EquipmentScreen()
        */

    Column() {
        Button(
            onClick = {
                navController.navigate("valgtudstyr")
            },
            modifier = Modifier.align(Alignment.End)
        )
        {
            Text(text = "Næste")
        }
    }


}

//Valgtudstyr er blevet til main
@Composable
fun ValgteUdstyr(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    Spacer(modifier = Modifier.height(20.dp))
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)

    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "Find udstyr", fontWeight = Bold, fontSize = 40.sp)
            Spacer(modifier = Modifier.height(50.dp))
        }


    }

    Spacer(modifier = Modifier.height(70.dp))
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(horizontal = 50.dp)
    ) {
        Spacer(modifier = Modifier.height(90.dp))
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
        EquipmentScreen()

        Column(modifier = Modifier.align(Alignment.End)) {

            Row() {
                Spacer(modifier = Modifier.width(40.dp))
                Button(
                    onClick = { navController.navigate("session") },
                ) {
                    Text(text = "Næste")
                }
            }
        }

    }


    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        //kode til valgte udstyr

        /*
        Row {
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "Valgte udstyr", fontWeight = FontWeight.Bold)

        }

         */


    }
}


/*

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

 */
/*
Column() {
    Button(
        onClick = {
            navController.popBackStack()
        },
        modifier = Modifier.align(Alignment.End)
    )
    {
        Text(text = "Tilbage")
    }
}

 */






@Composable
fun SessionScreen(navController: NavController) {

    Spacer(modifier = Modifier.height(10.dp))

    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
            Text(text = "Session for valgt udstyr", fontWeight = Bold, fontSize = 30.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {

            //kode efter onclick skal også ændres men ved ikke helt hvad den skal ændres til det er nok noget som kan hente fra database
            Button(onClick = { }) {
                //der skal nok være en kode som henter fra database
                Image(
                    painter = painterResource((R.drawable.sarastedy)),
                    contentDescription = "Equipment",
                    modifier = Modifier
                        .size(40.dp)

                )
                Text(text = "Sara Stedy", fontSize = 20.sp)

            }
        }

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
        ) {
            //kode til valgte udstyr
        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 50.dp)
        ) {
            Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(backgroundColor = Green)
                )
                {
                    Text(text = "START SESSION", fontSize = 20.sp, color = Color.White)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
            ) {
                Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {

                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(backgroundColor = Red)
                    ) {
                        Text(text = "STOP SESSION", fontSize = 20.sp, color = Color.White)
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
            ) {
                Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    //kode efter onclick skal også ændres men ved ikke helt hvad den skal ændres til det er nok noget som kan hente fra database
                    Button(onClick = { navController.popBackStack() })
                    {
                        //der skal nok være en kode som henter fra database
                        Text(text = "Tilbage", fontSize = 20.sp)
                    }


                }
            }
        }
    }
}











