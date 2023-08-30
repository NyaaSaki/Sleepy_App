package com.saki.speepocbt

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GetTask:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_task)

        val TextInput: EditText = findViewById<EditText>(R.id.EnterTaskName)
        val TextOutput : TextView = findViewById<TextView>(R.id.TextViewer)

        val enter: Button = findViewById<Button>(R.id.ButtonChange)

        enter.setOnClickListener{
            TextOutput.text = TextInput.text
        }


    }

}