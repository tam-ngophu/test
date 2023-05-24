package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txtm1 = findViewById<TextView>(R.id.txtm1)
        val txtm2 = findViewById<TextView>(R.id.txtm2)
        val txtm3 = findViewById<TextView>(R.id.txtm3)
        val txtm4 = findViewById<TextView>(R.id.txtm4)
        val txtm5 = findViewById<TextView>(R.id.txtm5)
        val btnm2 = findViewById<Button>(R.id.btnm2)

        txtm2.setText("Teacher: \"Kids,what does the chicken give you?\"\n" +
                "Student: \"Meat!\"\n" +
                "Teacher: \"Very good! Now what does the pig give you?\"\n" +
                "Student: \"Bacon!\"\n" +
                "Teacher: \"Great! And what does the fat cow give you?\"\n" +
                "Student: \"Homework!\"")
        txtm3.setText("This app will display a single joke for the user to read.\n" +
                "After reading the joke, the user will like or dislike the joke.\n" +
                "The app will record the vote in database and then show another joke for the user to read")
        btnm2.setOnClickListener {
            val inten2 = Intent (this,MainActivity4::class.java)
            startActivities(arrayOf(inten2))
        }
        txtm5.setOnClickListener {
            val inten3 = Intent (this,MainActivity4::class.java)
            startActivities(arrayOf(inten3))
        }
    }
}