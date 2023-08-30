package com.saki.speepocbt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var cycle: CountDownTimer


    override fun onCreate(savedInstanceState: Bundle?) {

        val intent = Intent(this,GetTask::class.java)


        var ctx = this
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        cycle = object : CountDownTimer(3000, 100) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                Toast.makeText(ctx, "Opening App...", Toast.LENGTH_SHORT).show()
                startActivity(intent)
            }


        }
    }

    override fun onStart() {
        super.onStart()
        val fluff:TextView = findViewById<TextView>(R.id.TextFluff)
        val flu = FluffLoader()
       fluff.text = flu.getfluff()
        cycle.start()

    }
}