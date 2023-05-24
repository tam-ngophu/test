package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val txt1mm = findViewById<TextView>(R.id.txt1mm)
        val txt2mm = findViewById<TextView>(R.id.txt2mm)
        val txt3mm = findViewById<TextView>(R.id.txt3mm)
        val txt4mm = findViewById<TextView>(R.id.txt4mm)
        val txt5mm = findViewById<TextView>(R.id.txt5mm)
        val btn2mm = findViewById<Button>(R.id.btn2mm)

        txt2mm.setText("A housewife, an accountant and a lawyer were asked \"How much is 2+2?\"\n" +
                "The housewife replies: \"Four!\".\n" +
                "The accountant says: \"I think it's either 3 or 4.  Let me run those figures through my spreadsheet one more time.\"\n" +
                "The lawyer pulls the drapes, dims the lights and asks in a hushed voice, \"How much do you want it to be?\"")
        txt3mm.setText("This app will display a single joke for the user to read.\n" +
                "After reading the joke, the user will like or dislike the joke.\n" +
                "The app will record the vote in database and then show another joke for the user to read")

        btn2mm.setOnClickListener {
            val inten1 = Intent (this,MainActivity3::class.java)
            startActivities(arrayOf(inten1))
        }
        txt5mm.setOnClickListener {
            val inten2 = Intent (this,MainActivity3::class.java)
            startActivities(arrayOf(inten2))
        }
    }
}