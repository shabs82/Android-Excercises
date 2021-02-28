package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val myDiceRoll = Random()
    val diceId = arrayOf(0,R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                          R.drawable.dice4, R.drawable.dice5, R.drawable.dice6)
    val myHistory = mutableListOf<Pair<Int , Int>>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickRoll(view: View) {
        val d1 = myDiceRoll.nextInt(6)+1
        val d2 = myDiceRoll.nextInt(6)+1
        imgDice1.setImageResource(diceId[d2])
        imgDice2.setImageResource(diceId[d1])
        if(myHistory.size>= 5)
            myHistory.removeAt(0)
        myHistory.add(Pair(d1+1, d2+2))
        updateHistory()
    }

      fun updateHistory() {
        var s = " "
        myHistory.forEach{p -> val e1 = p.first; val e2 = p.second
                           s += "$e1 - $e2\n"}
        tvHistory.text = s
    }

    fun onClickClear(view: View) {
        myHistory.clear()
        updateHistory()
    }
}