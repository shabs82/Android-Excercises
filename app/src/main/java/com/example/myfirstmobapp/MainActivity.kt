package com.example.myfirstmobapp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
   private val Tag = "xyz"
    val myGreetings = Greetings()

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Tag, "On Create")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOKEn.setOnClickListener { v -> onClickbtnOKEn(v)}
        btnOKDa.setOnClickListener { v -> onClickbtnOKDa(v)}
    }
    private fun onClickbtnOKEn(v: View){
        Log.d(Tag, "OnClickbtnOKEn")
      val name = etName.text
      val gr = myGreetings.getEnglishGreeting()
      val message = "$gr, $name"
        tvHeader.text = message
    }
    private fun onClickbtnOKDa(v : View){
        Log.d(Tag, "onClickbtnOKDa")
        val name = etName.text
        val gr = myGreetings.getDanishGreeting()
        val message = "$gr, $name"
        tvHeader.text = message
    }
}