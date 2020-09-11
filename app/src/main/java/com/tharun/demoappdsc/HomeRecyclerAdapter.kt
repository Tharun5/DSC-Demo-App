package com.tharun.demoappdsc

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class HomeRecyclerAdapter(val context: Context, private val itemList :ArrayList<Event>) : RecyclerView.Adapter<HomeRecyclerAdapter.HomeViewHolder>() {

    class HomeViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtEvent: TextView = view.findViewById(R.id.txtEvent)
        val imgEventImage : ImageView =view.findViewById(R.id.imgEventImage)
        val llContent : LinearLayout = view.findViewById(R.id.llContent)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view,parent,false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val event = itemList[position]
        holder.txtEvent.text = event.eventName
        holder.imgEventImage.setImageResource(event.eventImg)
        val eventLink = event.eventLink
        holder.llContent.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(eventLink))
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}