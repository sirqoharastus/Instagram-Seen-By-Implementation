package com.abdulqohar.instagramseenbyapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.abdulqohar.instagramseenbyapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var myAdapter: RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myAdapter = RecyclerViewAdapter()
        myAdapter.submitList(viewersList)

        var linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        linearLayoutManager.stackFromEnd = true
        binding.recyclerView.apply {
            this.layoutManager = linearLayoutManager
            addItemDecoration(ItemDecorator(-10))
            adapter = myAdapter
        }
    }

}