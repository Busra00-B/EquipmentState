package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
/*
class Main {

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
}

 */