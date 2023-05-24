package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt1 = findViewById<TextView>(R.id.txt1)
        val txt2 = findViewById<TextView>(R.id.txt2)
        val txt3 = findViewById<TextView>(R.id.txt3)

        txt2.setText("A child asked his father, \"How were people born?\"" +
                "So his father said, \"Adam and Eve made babies, then their babies became adults and made babies, and so on.\"" +
                "The child then went to his mother, asked her the same question and she told him, \"We were monkeys then we evolved to become like we are now.\"" +
                "The child ran back to his father and said, \"You lied to me!\"" +
                "His father replied, \"No, your mom was talking about her side of the family.\"")
        txt3.setText("This app will display a single joke for the user to read.\n" +
                "After reading the joke, the user will like or dislike the joke.\n" +
                "The app will record the vote in database and then show another joke for the user to read")
    }
}