package com.jaspreetkaur.recycleractivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerClass : RecyclerView.Adapter<RecyclerClass.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerClass.ViewHolder
    {
        var initView = LayoutInflater.from(parent.context).inflate(
            R.layout.layout_recycler, parent, false)
        return ViewHolder(initView)
    }
        class ViewHolder(view: View): RecyclerView.ViewHolder(view) {

            var tvId = view.findViewById<TextView>(R.id.tvId)
            var tvName= view.findViewById<TextView>(R.id.tvName)
        }

    override fun onBindViewHolder(holder: RecyclerClass.ViewHolder, position: Int) {
    }
    override fun getItemCount(): Int {
        return 6
    }
}