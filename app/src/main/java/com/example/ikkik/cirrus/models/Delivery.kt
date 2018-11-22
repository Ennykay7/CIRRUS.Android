package com.example.ikkik.cirrus.models

data class Delivery(
    val orderType: String? = null,
    val city: String? = null,
    val phone: String? = null,
    val streetAddress: String? = null,
    val ticketInception: String? = null,
    val ticketNum: String? = null,
    val customerRemark: String? = null,
    val storageLocation: String? = null,
    val customerName: String? = null
)