package com.example.finalproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageButton
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.R
import com.example.finalproject.adapter.ItemAdapter
import com.example.finalproject.model.Item
import com.example.finalproject.model.ItemData
import java.io.Serializable
import java.util.ArrayList

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvItems: RecyclerView
    private lateinit var btnProfile: ImageButton

    private var list: ArrayList<Item> = arrayListOf()
    private var title: String = "IKEA Mobile"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = title

        rvItems = findViewById(R.id.rv_items)
        rvItems.setHasFixedSize(true)

        btnProfile = findViewById(R.id.btn_profile)
        btnProfile.setOnClickListener(this)

        list.addAll(ItemData.listData)
        populateRecyclerList()
    }

    private fun populateRecyclerList() {
        rvItems.layoutManager = LinearLayoutManager(this)
        val itemAdapter = ItemAdapter(list)
        rvItems.adapter = itemAdapter

        itemAdapter.setOnItemClickCallback(object : ItemAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Item) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.INTENT_EXTRA,data as Serializable)
                startActivity(intent)
            }
        })
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_profile -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}