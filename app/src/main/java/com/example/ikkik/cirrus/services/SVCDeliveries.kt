package com.example.ikkik.cirrus.services

import com.google.firebase.database.FirebaseDatabase
import java.sql.Time
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.LocalTime
import java.util.*
import android.util.Log

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
        database.getReference("deliveries/${formatter.format(today)}")
        
    }
}