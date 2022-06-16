package dtu.engtech.iabr.stateincompose

import android.util.Log
import androidx.compose.runtime.toMutableStateList
import com.google.firebase.firestore.FirebaseFirestore
import dtu.engtech.iabr.stateincompose.core.Constants

class EquipmentRepositoryFirestore: EquipmentRepository {
    var equipment = mutableListOf<Equipment>().toMutableStateList()

    override fun getEquipment() {
        FirebaseFirestore.getInstance().collection(Constants.EQUIPMENT)
            .addSnapshotListener { snapshot, e ->
                if (e != null) {
                    Log.w(Constants.FIREBASETAG, "Listen failed.", e)
                    //return@addSnapshotListener
                }

                if (snapshot != null) {
                    equipment = snapshot.toObjects(Equipment::class.java).toMutableStateList()
                    Log.d(Constants.FIREBASETAG, "Current data size: ${equipment.size}")
                    Log.d(Constants.FIREBASETAG, "Udstyr: ${equipment}")
                    logEquipment()

                } else {
                    Log.d(Constants.FIREBASETAG, "Current data: null")
                }
            }
    }



    fun logEquipment() {
        for (equipmentMember in equipment) {
            Log.d(Constants.FIREBASETAG, "Member: $equipmentMember")
        }
    }

/*
    //kode tillocation
    var location = mutableListOf<Equipment>().toMutableStateList()

    fun getLocation(locationID: String) {
        val docRef = FirebaseFirestore.getInstance().collection(Constants.EQUIPMENT)
        docRef.whereEqualTo(Constants.BEACONTAG, locationID)
            .get()
            .addOnSuccessListener { documents ->
                location = documents.toObjects(Equipment::class.java).toMutableStateList()
                for (document in documents) {
                    //Log.d(FirestoreBeaconConstants.FIREBASELOGTAG, "Number of documents => ${documents.size()}")
                    Log.d(Constants.FIREBASETAG, "${document.id} => ${document.data}")
                }
            }
            .addOnFailureListener { exception ->
                Log.w(Constants.FIREBASETAG, "Error getting documents: ", exception)
            }
    }

 */
}


