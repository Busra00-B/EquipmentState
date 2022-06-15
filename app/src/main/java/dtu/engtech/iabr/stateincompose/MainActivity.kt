package dtu.engtech.iabr.stateincompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.firestore.FirebaseFirestore
import dtu.engtech.iabr.stateincompose.ui.theme.StateInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateInComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    //modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    EquipmentScreen()
                    Navigation()

                }
            }
        }
        testFirestoreGet()
    }

    private fun testFirestoreGet() {
        val docRef = FirebaseFirestore.getInstance().collection("equipment")
        docRef.get()
            .addOnSuccessListener { documents ->
                for (document in documents){
                    Log.d("Firebase","${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener{exception ->
                Log.w("Firebase","Error getting documents: ", exception)
            }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StateInComposeTheme {
        EquipmentScreen()
        Navigation()
    }
}





