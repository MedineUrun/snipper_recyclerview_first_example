package com.example.my_homework

object Database {

    val names = mutableListOf<String>("Mustafa","Berk","")

    val cars = mutableListOf(

        Car1(1, "34 ABC 123","BMW", R.drawable.bmw),
        Car1(2, "32 GDF 23","AUDI", R.drawable.audi),
        Car1(3, "75 KHJ 432","MERCEDES", R.drawable.mercedes),
        Car1(4, "43 THY 432","TESLA", R.drawable.tesla),
        Car1(5, "45 HGF 423","HONDA", R.drawable.honda),

    )

}

data class Car1(val id:Int, val plate:String, val brand:String, val logo:Int){

    fun getListName() = "$brand,$plate"
}
