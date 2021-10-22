package com.example.exam6


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.exam6.network.Content

class MyAdapter(private val items: List<Content>):RecyclerView.Adapter<MyAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = items[position].titleKA
        holder.description.text = items[position].descriptionKA
//        holder.image.text = items[position].titleKA
        holder.date.text = items[position].publishDate


    }

    override fun getItemCount() = items.size

    inner class ViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val title = view.findViewById<TextView>(R.id.TV_title)
        val image = view.findViewById<ImageView>(R.id.IV_image)
        val description = view.findViewById<TextView>(R.id.TV_description)
        val date = view.findViewById<TextView>(R.id.TV_date)


    }

}


