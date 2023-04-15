package com.example.customviewson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.get
import com.bumptech.glide.Glide

import com.example.customviewson.databinding.ActivityMainBinding
import com.example.customviewson.databinding.CustomViewBinding


class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val film = CustomData("Titanic", 1997,R.drawable.indir)
        val film2 = CustomData("Titanic", 1997,R.drawable.indir)
        val film3 = CustomData("Titanic1234", 1997,R.drawable.indir)
       // binding.customView.setFilm(film)



        binding.btnEkle.setOnClickListener {

            val customViewBinding=CustomViewBinding.inflate(layoutInflater)
            val customView = customViewBinding.root
            customViewBinding.txtTitle.text=film.title
            customViewBinding.txtYear.text = film.year.toString()
            Glide.with(customViewBinding.img)
                .load(film.url)
                .into(customViewBinding.img)

            binding.container.addView(customView)

            customViewBinding.btnSil.setOnClickListener {
                binding.container.removeView(customView)
            }

        }
}




    }



