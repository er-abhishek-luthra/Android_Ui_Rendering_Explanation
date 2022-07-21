package com.example.android_ui_rendering_explanation

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val textList: List<String>) : RecyclerView.Adapter<ListAdapter.TextViewHolder>() {
    class TextViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val textView: TextView

        init {
            textView = itemView.findViewById(R.id.tv_item)
            textView.setOnClickListener{
                it.setBackgroundColor(Color.CYAN)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TextViewHolder {
        val  itemView = LayoutInflater.from(parent.context).inflate(R.layout.recylerview_item,parent,false)
        return TextViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TextViewHolder, position: Int) {
        holder.textView.text = textList[position]
    }

    override fun getItemCount(): Int {
        return  textList.size
    }
}