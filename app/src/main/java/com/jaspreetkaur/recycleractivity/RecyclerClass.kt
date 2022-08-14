package com.jaspreetkaur.recycleractivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerClass(var array: ArrayList<RecyclerDataClass>) : RecyclerView.Adapter<RecyclerClass.ViewHolder>(){
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

        holder.tvId.setText(array.get(position).id.toString())
        holder.tvName.setText(array.get(position).name)
    }
    override fun getItemCount(): Int {
       return array.size
    }
}