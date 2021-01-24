package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val name= intent.getStringExtra("WON")
        textView3.setText(name)
    }

    fun startNewGame(view: View) {

        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}