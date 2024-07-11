package com.example.coffeetruckfinalproject2024

import android.os.Bundle
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
        coffeeTruckList = findViewById(R.id.lvCoffeeTruckFeed)
        coffeeTruckList?.adapter = CoffeeTruckListAdapter()
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
            var view : View? = null
            if(convertView == null){
                view = LayoutInflater.from(parent?.context).inflate(R.layout.coffeetruckrow,parent,false)
            }
            //view= view?:convertView
            val tvRowName :TextView? = view?.findViewById(R.id.tvRowName) ?:
                convertView?.findViewById(R.id.tvRowName)
            tvRowName?.text = "Test"
            return view ?: convertView!!
        }
    }
}