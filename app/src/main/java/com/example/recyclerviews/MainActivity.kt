package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayNamesList()
    }
    fun displayNamesList(){
        var names = listOf("Ruth","Essy","Mercy","Rebecca","Cathy","Annet","Ishimwe","Yvonne",
            "Bosibori","Cynthia","Yekebedi")
        binding.recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        var namesAdapter =NameRvAdaptor(names)
        binding.recycler.adapter = namesAdapter

    }
}
