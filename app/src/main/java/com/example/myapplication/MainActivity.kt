package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textoemail = findViewById<EditText>(R.id.Ingresoemail)
        textoemail.setOnClickListener {
            Toast.makeText(this, textoemail.text, Toast.LENGTH_LONG).show()
        }

        var botonacceder = findViewById<Button>(R.id.buttonlogin)
        botonacceder.setOnClickListener {
            Toast.makeText(this,"hola "+textoemail.text, Toast.LENGTH_LONG).show()
        }
        var passwordlogin = findViewById<EditText>(R.id.password)
        var registrarcuenta = findViewById<Button>(R.id.registrar)
        registrarcuenta.setOnClickListener {
            val iActHome = Intent(this, HomeActivity::class.java)
            startActivity(iActHome)
        }


        //setup
        setup()
    }
    private fun setup() {
        title = "Autenticación"


    }
}