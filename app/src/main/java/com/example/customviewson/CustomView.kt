package com.example.customviewson

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater


import androidx.cardview.widget.CardView
import com.bumptech.glide.Glide

import com.example.customviewson.databinding.CustomViewBinding

class CustomView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
        )
    : CardView(context, attrs, defStyleAttr) {

    private  var binding2: CustomViewBinding


    init {

        binding2 = CustomViewBinding.inflate(LayoutInflater.from(context), this, true)







    }




    }

