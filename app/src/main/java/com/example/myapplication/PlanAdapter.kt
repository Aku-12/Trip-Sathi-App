package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlanAdapter(private val plans: List<Plan>) : RecyclerView.Adapter<PlanAdapter.PlanViewHolder>() {


    class PlanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val tvPlace: TextView = itemView.findViewById(R.id.tvPlace)
        val tvDates: TextView = itemView.findViewById(R.id.tvDates)
        val tvLocation: TextView = itemView.findViewById(R.id.tvLocation)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plan, parent, false)
        return PlanViewHolder(view)
    }


    override fun onBindViewHolder(holder: PlanViewHolder, position: Int) {
        val plan = plans[position]
        holder.imageView.setImageResource(plan.imageResId)
        holder.tvPlace.text = plan.place
        holder.tvDates.text = plan.dates
        holder.tvLocation.text = plan.location
    }


    override fun getItemCount(): Int = plans.size
}
