package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val txt1m = findViewById<TextView>(R.id.txt1m)
        val txt2m = findViewById<TextView>(R.id.txt2m)
        val txt3m = findViewById<TextView>(R.id.txt3m)
        val txt4m = findViewById<TextView>(R.id.txt4m)
        val txt5m = findViewById<TextView>(R.id.txt5m)
        val btn2m = findViewById<Button>(R.id.btn2m)

        txt2m.setText("The teacher asked Jimmy, \"Why is your cat at school today Jimmy?\"\n" +
                "Jimmy replied crying, \"Because I heard my daddy tell my mommy, 'I am going to eat that pussy once Jimmy leaves for school today!'\"")
        txt3m.setText("This app will display a single joke for the user to read.\n" +
                "After reading the joke, the user will like or dislike the joke.\n" +
                "The app will record the vote in database and then show another joke for the user to read")

        btn2m.setOnClickListener {
            val inten1 = Intent (this,MainActivity5::class.java)
            startActivities(arrayOf(inten1))
        }
        txt5m.setOnClickListener {
            val inten2 = Intent (this,MainActivity5::class.java)
            startActivities(arrayOf(inten2))
        }
    }
}