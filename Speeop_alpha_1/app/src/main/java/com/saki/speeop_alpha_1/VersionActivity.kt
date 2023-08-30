package com.saki.speeop_alpha_1

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class VersionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cryla)

        val quo = factSender()
        val saki: ImageView = findViewById<ImageView>(R.id.saki_icon)
        val layla: ImageView = findViewById<ImageView>(R.id.layla_button)
        val quote: TextView = findViewById(R.id.versionInfo) as TextView
        val fade = Intent(this, CrossFade::class.java)



        // go back
        layla.setOnClickListener {
            Toast.makeText(this,"Back to slope",Toast.LENGTH_SHORT).show()
            finish()
        }

        saki.setOnClickListener {
            quote.text = quo.getquote()
            saki.animate().apply {
                duration = 1000
                alpha(0f)
            }
            startActivity(fade)
        }


    }


}