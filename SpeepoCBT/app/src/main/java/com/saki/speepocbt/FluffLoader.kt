package com.saki.speepocbt

class FluffLoader {

    val quo = arrayOf(
        "People Die when they are killed","You should study","Remember to do stretches","saki has her own \"laws\"",
        "kurukuru~","Kururing~","Rules are made to be broken"

    )

    fun getfluff() : String{
        return quo.random()
    }
}