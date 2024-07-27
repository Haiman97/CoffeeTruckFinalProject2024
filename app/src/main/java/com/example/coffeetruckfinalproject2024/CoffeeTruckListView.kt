package com.example.coffeetruckfinalproject2024

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
var coffeeTruckList:ListView? = null
class CoffeeTruckListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_coffee_truck_list_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("CoffeeTruckListView", "onCreate called")
        try {
            coffeeTruckList = findViewById(R.id.lvCoffeeTruckFeed)
            coffeeTruckList?.adapter = CoffeeTruckListAdapter()
        } catch (e: Exception) {
            // Log the exception with the error level
            Log.e("CoffeeTruckListView", "Error initializing ListView", e)
        }
    }
    //Adapter Creation
    class CoffeeTruckListAdapter:BaseAdapter(){
        override fun getCount(): Int = 20
        override fun getItem(position: Int): Any {
            return 0
        }
        override fun getItemId(position: Int): Long {
            return 0
        }
        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            var view :View? = null
            //var rowView = convertView
            if(convertView == null){
                view = LayoutInflater.from(parent?.context).inflate(R.layout.coffeetruckrow,parent,false)
            }
            //view = view?:convertView
            val tvRowName :TextView? = view?.findViewById(R.id.tvRowName) ?:
            convertView?.findViewById(R.id.tvRowName)
            //val tvRowName :TextView? = view?.findViewById(R.id.tvRowName) ?:
            //val coffeeTruck = data[position]
            tvRowName?.text = "Coffee Truck Name"
            val tvRowLocaion = view?.findViewById<TextView>(R.id.tvRowLocation)
            return view ?: convertView!!
        }
    }



    /*class CoffeeTruckListAdapter : BaseAdapter() {

        // Replace 20 with your actual data count
        override fun getCount(): Int = 20

        // These methods are not strictly necessary for a simple list but can be used for
        // advanced functionality. They can return any value here.
        override fun getItem(position: Int): Any {
            return position
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val view: View = convertView ?: LayoutInflater.from(parent?.context).inflate(R.layout.coffeetruckrow, parent, false)

            // Find TextViews using their IDs
            val tvRowName: TextView = view.findViewById(R.id.tvRowName)
            val tvRowLocation: TextView = view.findViewById(R.id.tvRowLocation)
            Log.d("CoffeeTruckListView", "tvrowname & tvrowlocation V")

            // Replace with your actual data source (e.g., fetch from API or database)
            tvRowName.text = "Coffee Truck Name - $position"  // Add position for demonstration
            tvRowLocation.text = "Coffee Truck Location - $position"
            Log.d("CoffeeTruckListView", "text in vars")

            return view
        }*/
    }






