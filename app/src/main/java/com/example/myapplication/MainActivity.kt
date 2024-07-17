package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)


        recyclerView.layoutManager = LinearLayoutManager(this)

        val plans = listOf(
            Plan(R.drawable.delhi, "Delhi", "12 Feb - 1 March", "Delhi, India"),
            Plan(R.drawable.kerala, "Kerala", "12 Feb - 1 March", "Kerala, India"),
            Plan(R.drawable.rajasthan, "Rajasthan", "12 Feb - 1 March", "Rajasthan, India"),
            Plan(R.drawable.tibet, "Tibet", "12 Feb - 1 March", "Tibet")
        )


        recyclerView.adapter = PlanAdapter(plans)
    }
}
