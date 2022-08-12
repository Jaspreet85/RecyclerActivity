package com.jaspreetkaur.recycleractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jaspreetkaur.recycleractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: RecyclerClass
    lateinit var linearLayoutManager : LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = RecyclerClass()
        linearLayoutManager = LinearLayoutManager(this)
        binding.rvRecycler.adapter = adapter
        binding.rvRecycler.layoutManager = linearLayoutManager
    }
}