package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    private lateinit var ageEditText: EditText
    private lateinit var ageButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        ageEditText = findViewById(R.id.ageEditText)
        ageButton = findViewById(R.id.ageButton)
        val name = intent.extras?.getString("NAME")
        ageButton.setOnClickListener {
            val ageText: String = ageEditText.text.toString()
            if (ageText.isEmpty())
                return@setOnClickListener
            val age: Int = ageText.toInt()
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("NAME",name).putExtra("AGE",age)
            startActivity(intent)
            finish()


        }



    }
}