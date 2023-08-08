package com.example.datatest.model

data class User(
    val image:String,
    val name:String,
    val time:String,
    val message:String,
    val isOnline:Boolean=false
)
