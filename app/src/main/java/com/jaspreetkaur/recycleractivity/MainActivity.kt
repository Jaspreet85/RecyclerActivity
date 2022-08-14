package com.jaspreetkaur.recycleractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.core.os.postDelayed
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jaspreetkaur.recycleractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: RecyclerClass
   lateinit var linearLayoutManager : LinearLayoutManager
//    lateinit var gridLayoutManager: GridLayoutManager
    var array: ArrayList<RecyclerDataClass> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        array.add(RecyclerDataClass(1,"Preet"))
        array.add(RecyclerDataClass(2,"Naina"))
        array.add(RecyclerDataClass(3,"Reet"))
        array.add(RecyclerDataClass(4,"Jot"))
        array.add(RecyclerDataClass(5,"Deep"))

        adapter = RecyclerClass(array)
    //    gridLayoutManager =  GridLayoutManager(this,3)
        linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rvRecycler.adapter = adapter
       binding.rvRecycler.layoutManager = linearLayoutManager
     //   binding.rvRecycler.layoutManager = gridLayoutManager

binding.rvRecycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
        if(linearLayoutManager.findLastCompletelyVisibleItemPosition()==array.size - 1){
            binding.pbProgress.visibility= View.VISIBLE

            Handler(Looper.getMainLooper()).postDelayed({
                array.add(RecyclerDataClass(1,"Preet"))
                array.add(RecyclerDataClass(2,"Naina"))
                array.add(RecyclerDataClass(3,"Reet"))
                array.add(RecyclerDataClass(4,"Jot"))
                array.add(RecyclerDataClass(5,"Deep"))

                adapter.notifyDataSetChanged()
                binding.pbProgress.visibility = View.GONE
            },500)
    }
}
        })
    }
}