package com.example.ikkik.cirrus.services

import com.example.ikkik.cirrus.models.Delivery
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import java.text.SimpleDateFormat
import java.util.*

class SVCDeliveries
{
    private val database: FirebaseDatabase
        get()
        {
            return FirebaseDatabase.getInstance()
        }

    fun downloadDeliveries(onDone: (List<Delivery>?) -> Unit)
    {
        val today = Date()
        val formatter = SimpleDateFormat("yyyy-M-d", Locale.US)
        println(formatter.format(today))
        database.getReference("deliveries/${formatter.format(today)}")
            .orderByKey()
            .addValueEventListener(
                object : ValueEventListener
                {
                    override fun onCancelled(p0: DatabaseError)
                    {
                        //TODO handle the error
                        onDone(null)
                    }

                    override fun onDataChange(p0: DataSnapshot)
                    {
                        onDone(p0.children.mapNotNull {
                            it.getValue(Delivery::class.java)
                        })
                    }
                })
    }
}