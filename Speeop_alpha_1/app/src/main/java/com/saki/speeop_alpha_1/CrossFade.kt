package com.saki.speeop_alpha_1

import android.R.attr.delay
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.*


fun getalp(rad : Float,delay : Float) : Float{
    return max( sin(rad*0.35f + delay),0f )
}


class CrossFade : AppCompatActivity(){

    private lateinit var cycle: CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.crossfade)
        var rad = 0.0f
        val s1: ImageView = findViewById<ImageView>(R.id.Star1)
        val s2: ImageView = findViewById<ImageView>(R.id.Star2)
        val s3: ImageView = findViewById<ImageView>(R.id.Star3)


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
                alpha(getalp(rad,0f))
            }

            cycle = object : CountDownTimer(10_000,100){
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
                        alpha(getalp(rad,0f))
                    }
                    if(rad >= 9.3f) {
                        rad = 0.0f
                    }
                }

                override fun onFinish() {
                    //Toast.makeText(this,"Reached End of Animation",Toast.LENGTH_SHORT).show()
                    finish()
                }


            }


    }

    override fun onStart() {
        super.onStart()
        cycle.start()
    }



}