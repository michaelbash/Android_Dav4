package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity(){
    private lateinit var emailEditText: EditText
    private lateinit var emailButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        emailEditText = findViewById(R.id.email)
        emailButton = findViewById(R.id.emailButton)

        emailButton.setOnClickListener {

            val name = intent.extras?.getString("NAME")
            val age: Int? = intent.extras?.getInt("AGE")
            val email: String = emailEditText.text.toString()

            if (email.isEmpty()) {
                return@setOnClickListener
            }

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME",name).putExtra("AGE",age).putExtra("EMAIL",email)
            startActivity(intent)




    }


}}