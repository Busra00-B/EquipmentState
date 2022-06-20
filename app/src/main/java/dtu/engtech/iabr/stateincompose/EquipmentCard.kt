package dtu.engtech.iabr.stateincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EquipmentCard(
    equipment: Equipment

) {

    Row(
        modifier = Modifier
            .padding(all = 8.dp)
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource((R.drawable.findit)),
            contentDescription = "Equipment",
            modifier = Modifier
                .size(50.dp)

        )

        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(
                text = equipment?.name ?: "", fontSize = 20.sp
            )

            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = equipment?.location ?: "", fontSize = 20.sp,
                modifier = Modifier.padding(all = 4.dp),
                style = MaterialTheme.typography.body2
            )
        }

    }
}








