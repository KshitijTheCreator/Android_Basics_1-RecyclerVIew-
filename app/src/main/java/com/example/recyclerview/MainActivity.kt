package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.adapter.MyAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.Song

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val songsObject = mutableListOf<Song>()
        songsObject.add(Song("Touch the sky", "Kanye West", "Late Registration"))
        songsObject.add(Song("Rock bottom", "Eminem", "Marshal Mathers LP"))
        songsObject.add(Song("No Church In The Wild", "Kanye West & Jay-Z", "Watch The Throne"))
        songsObject.add(Song("California Love", "Tupac & Dr.Dre", "All Eyes On Me"))
        songsObject.add(Song("We Don't Care", "Kanye West", "The College Dropout"))
        songsObject.add(Song("Family Business", "Kanye West", "The College Dropout"))
        songsObject.add(Song("Good Morning", "Kanye West", "Graduation"))
        songsObject.add(Song("Flashing Lights", "Kanye West", "Graduation"))
        songsObject.add(Song("Money Trees (Ft. Jay Rock)", "Kendrick Lamar", "Good Kid m.A.A.D City"))
        songsObject.add(Song("Ultralight Beam", "Kanye West", "The Life Of Pablo"))
        songsObject.add(Song("Hot(Ft. Gunna)", "Young Thug", "So Much Fun"))
        songsObject.add(Song("Wyclef Jean", "Young Thug", "Jeffrey"))
        songsObject.add(Song("Street Lights", "Kanye West", "8O8s and HeartBreak"))
        songsObject.add(Song("Say You Will", "Kanye West", "8O8s and HeartBreak"))
        songsObject.add(Song("Coldest Winter", "Kanye West", "8O8s and HeartBreak"))
        songsObject.add(Song("Lollipop", "Lil Wayne", "Tha Carter III"))
        songsObject.add(Song("Mirror(Ft. Bruno Mars)", "Lil Wayne", "Tha Carter IV"))
        songsObject.add(Song("Can't Be Broken", "Lil Wayne", "Tha Carter V"))
        songsObject.add(Song("3 Peat", "Lil Wayne", "Tha Carter III"))

        binding.songsList.adapter = MyAdapter(songsObject)
        binding.songsList.layoutManager = LinearLayoutManager(this)
    }
}