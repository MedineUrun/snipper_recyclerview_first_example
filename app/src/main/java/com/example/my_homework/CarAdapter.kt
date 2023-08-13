package com.example.my_homework;

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter constructor(val context: Context, val cars:List<Car>): RecyclerView.Adapter<CarAdapter.CustomViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.cars_list_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cars.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val car = cars[position]

        holder.ivCar.setImageResource(car.logo)
        holder.tvFullName.text = "${car.brand} ${car.plate}"

    }

    class CustomViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val ivCar: ImageView = itemView.findViewById(R.id.ivCar)
        val tvFullName: TextView = itemView.findViewById(R.id.tvFullName)
    }


}