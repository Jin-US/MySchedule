package com.example.mySchedule;

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.mySchedule.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val registerButton = findViewById<View>(R.id.registerButton) as TextView
        registerButton.setOnClickListener {
            val registerIntent = Intent(this@LoginActivity, RegisterActivity::class.java)
            this@LoginActivity.startActivity(registerIntent)
        }
        val loginButton = findViewById<View>(R.id.loginButton) as TextView
        loginButton.setOnClickListener {
            //                Intent mainIntent = new Intent(LoginActivity.this, MainActivity.class);
//                LoginActivity.this.startActivity(mainIntent);
        }
        val NonLogin = findViewById<View>(R.id.Next) as TextView
        NonLogin.setOnClickListener {
            val mainIntent = Intent(this@LoginActivity, MainActivity::class.java)
            this@LoginActivity.startActivity(mainIntent)
        }
    }
}