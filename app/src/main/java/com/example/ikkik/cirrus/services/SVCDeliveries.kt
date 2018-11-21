package com.example.ikkik.cirrus.services

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

    fun downloadDeliveries()
    {
        val today = Date()
        val formatter = SimpleDateFormat("yyyy-M-d", Locale.US)
        database.getReference("deliveries/${formatter.format(today)}").orderByKey()
                .addValueEventListener(
                        object : ValueEventListener
                        {
                            override fun onCancelled(p0: DatabaseError)
                            {
                                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                            }

                            override fun onDataChange(p0: DataSnapshot)
                            {
                                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                            }
                        })
    }
}