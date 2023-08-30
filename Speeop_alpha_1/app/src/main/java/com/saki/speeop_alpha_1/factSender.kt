package com.saki.speeop_alpha_1

class factSender {

    val quo = arrayOf(
    "There is nothing here", "This is a version info screen" ,
        "Stop clicking lol" , "Abandon all hope yee who enter here",
        "Nothing interesting here" , "Click on the sleepo to go back",
        "Here is a fact. Sleep early to manage hormones"
    )

    fun getquote() : String{
        return quo.random()
    }
}