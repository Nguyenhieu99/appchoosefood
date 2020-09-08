package com.example.app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context : Context , var mangmonan : ArrayList<MonAn>) : BaseAdapter() {
    class ViewHolder(row :View) {
        var textviewtenmonan : TextView
        var imageviewmonan : ImageView

        init {
            textviewtenmonan = row.findViewById(R.id.textviewtenmonan) as TextView
            imageviewmonan = row.findViewById(R.id.imageviewhinhmonan) as ImageView
        }
    }
    override fun getView(position: Int, convertview: View?, p2: ViewGroup): View {
        var view : View?
        var viewholder : ViewHolder
        if(convertview == null){
            var layoutinflater : LayoutInflater = LayoutInflater.from(context)
            view = layoutinflater.inflate(R.layout.dong_monan,null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        }else{
            view = convertview
            viewholder = convertview.tag as ViewHolder
        }
        var monan : MonAn = getItem(position) as MonAn
        viewholder.textviewtenmonan.text = monan.ten
        viewholder.imageviewmonan.setImageResource(monan.hinhanh)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return mangmonan.size
    }

}