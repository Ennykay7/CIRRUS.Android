package com.example.ikkik.cirrus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ikkik.cirrus.services.SVCDeliveries
import kotlinx.android.synthetic.main.activity_acmain.*

class ACMain : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acmain)
    }

    override fun onResume()
    {
        super.onResume()

        SVCDeliveries().downloadDeliveries {
            deliveryLbl?.text = it?.joinToString(separator = "\n\n")
        }
    }
}
