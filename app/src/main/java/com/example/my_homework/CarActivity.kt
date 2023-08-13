package com.example.my_homework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CarActivity : AppCompatActivity() {

    val cars = listOf(
        Car(1, "34 ABC 123","BMW", R.drawable.bmw),
        Car(2, "32 GDF 23","AUDI", R.drawable.audi),
        Car(3, "75 KHJ 432","MERCEDES", R.drawable.mercedes),
        Car(4, "43 THY 432","TESLA", R.drawable.tesla),
        Car(5, "45 HGF 423","HONDA", R.drawable.honda),
    )
    lateinit var rvCars: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cars)

        rvCars = findViewById(R.id.rvCars)

        rvCars.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvCars.adapter = CarAdapter(this, cars)


    }
}