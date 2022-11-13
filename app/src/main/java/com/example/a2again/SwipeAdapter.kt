package com.example.a2again

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class SwipeAdapter(context: Context, list: ArrayList<String>): BaseAdapter() {

    private val context: Context
    private val list: List<String>


    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any? {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView: View? = convertView
        if(convertView == null){
            convertView = LayoutInflater.from(parent!!.context).inflate(R.layout.item_koloda,parent,false)
        }

        val itemName = convertView?.findViewById<TextView>(R.id.tv_name)
        var currentItem = getItem(position)
        
        
        itemName?.text = currentItem.toString()
        return convertView
    }


    init {
        this.context = context
        this.list = list
    }

}