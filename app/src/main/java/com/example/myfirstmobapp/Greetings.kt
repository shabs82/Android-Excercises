package com.example.myfirstmobapp

import java.util.*

class Greetings {

    val englishGreetings = arrayOf(" Hello, how you been mate, what's going on")
    val danishGreetings = arrayOf("Hej, Hvordan gor de")
    val myRandom = Random()// why do you use java util import instead of kotlin

    public fun getEnglishGreeting(): String {
        val indx = myRandom.nextInt(englishGreetings.size)
        return englishGreetings[indx];

    }

    public fun getDanishGreeting(): String {
        val indx = myRandom.nextInt(danishGreetings.size)
        return danishGreetings[indx];
    }

}