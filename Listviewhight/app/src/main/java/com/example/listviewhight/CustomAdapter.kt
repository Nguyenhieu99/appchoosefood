package com.example.listviewhight

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView

class CustomAdapter (var context : Context, var mangmonan : ArrayList<Food>) : BaseAdapter() {
    class ViewHolder(row: View){
        var textviewnamefood : TextView
        var imageviewfood : ImageView
        init {
            textviewnamefood = row.findViewById(R.id.textviewnamefood) as TextView
            imageviewfood = row.findViewById(R.id.imageviewnubmerfood) as ImageView
        }
    }
    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var view : View?
        var viewHolder : ViewHolder
        if (convertview == null) {
            var layoutInflater : LayoutInflater= LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.linenumber_food,null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertview
            viewHolder = convertview.tag as ViewHolder
        }
        var monan : Food = getItem(position) as Food
        viewHolder.textviewnamefood.text = monan.name
        viewHolder.imageviewfood.setImageResource(monan.image)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return mangmonan.size
    }
}