package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.model.Song

class MyAdapter(val songs: List<Song>) :RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    //we store the references of our view here
    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var songTitle = itemView.findViewById<TextView>(R.id.songName)
        var artistName = itemView.findViewById<TextView>(R.id.artistName)
        var albumName = itemView.findViewById<TextView>(R.id.albumName)
    }
//onCreateViewHolder creates the view holder for us where we pass our view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //layoutInflater converts the xml to java objects
        val inflater = LayoutInflater.from(parent.context)

        //once the inflater is created now we can inflate to our
        val view= inflater.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.songTitle.text = songs[position].songName
        holder.artistName.text = songs[position].artistName
        holder.albumName.text = songs[position].albumName
    }
    //simply pass how many items are there to show
    override fun getItemCount(): Int {
        return songs.size
    }
}