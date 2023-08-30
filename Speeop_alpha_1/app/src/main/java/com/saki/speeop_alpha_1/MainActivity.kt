package com.saki.speeop_alpha_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.*
import com.saki.speeop_alpha_1.R.*


class MainActivity : AppCompatActivity() {


    private lateinit var cycle: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {

        var ctx = this
        var quo = quoteSender()
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)


        // Data is displayed in the TextView
        val quote: TextView = findViewById(id.quotes) as TextView
        val layla: ImageView = findViewById(id.layla_icon) as ImageView
        val saki: ImageView = findViewById<ImageView>(id.saki_button)
        val intent = Intent(this, VersionActivity::class.java)


        layla.setOnClickListener {
        //    quote.text = quo.getquote()
            //Toast.makeText(this, "generating a slepoe quote", Toast.LENGTH_SHORT).show()

        }

        saki.setOnClickListener {
            Toast.makeText(ctx, "About App", Toast.LENGTH_SHORT).show()
        //    startActivity(intent)
        }


        // Glittering Background
        var rad = 0.0f
        val s1: ImageView = findViewById<ImageView>(R.id.stars1)
        val s2: ImageView = findViewById<ImageView>(R.id.stars2)
        val s3: ImageView = findViewById<ImageView>(R.id.stars3)


        rad = rad + 0.1f
        s1.animate().apply {
            duration = 2000
            alpha(getalp(rad, -4.7f))
        }

        s2.animate().apply {
            duration = 2000
            alpha(getalp(rad, 4.7f))
        }

        s3.animate().apply {
            duration = 2000
            alpha(getalp(rad, 0f))
        }

        cycle = object : CountDownTimer(10_000_000, 100) {
            override fun onTick(millisUntilFinished: Long) {
                rad = rad + 0.1f
                s1.animate().apply {
                    duration = 100
                    alpha(getalp(rad, -4.7f))
                }

                s2.animate().apply {
                    duration = 100
                    alpha(getalp(rad, 4.7f))
                }

                s3.animate().apply {
                    duration = 100
                    alpha(getalp(rad, 0f))
                }
                if (rad >= 9.3f) {
                    rad = 0.0f
                }
            }

            override fun onFinish() {

            }


        }
    }

    override fun onStart() {
        super.onStart()
        cycle.start()
    }
}