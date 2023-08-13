package com.example.my_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    lateinit var carButton: Button
    lateinit var spCars:Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carButton = findViewById(R.id.carButton)
        spCars = findViewById(R.id.spCars)
        val carsPlateNoAndModelNames = Database.cars.map { "${it.brand} ${it.plate}" }
        spCars.adapter = ArrayAdapter(this,R.layout.tv_custom_spinner_item, carsPlateNoAndModelNames)

        carButton.setOnClickListener {
            val intent = Intent(this, CarActivity::class.java)
            startActivity(intent)
        }
    }
}