package com.example.viewpager.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.viewpager.R


class FragmentOne: Fragment(R.layout.fragment_one) {

    private lateinit var firstname:TextView
    private lateinit var lastName:TextView
    private lateinit var age:TextView
    private lateinit var imageView: ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        firstname = view.findViewById(R.id.name)
        lastName = view.findViewById(R.id.lastName)
        imageView = view.findViewById(R.id.imageView)
        age = view.findViewById(R.id.age)

        val sharedPreferences = this.activity!!.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)

        val savedName = sharedPreferences.getString("NAME", "")
        val savedLastName = sharedPreferences.getString("LAST", "")
        val savedUrl = sharedPreferences.getString("URL", "https://cdn.discordapp.com/attachments/775749760572325891/802759755428659200/IMG_20201221_141204.jpg")
        val savedAge = sharedPreferences.getString("AGE", "0")

        firstname.text = savedName
        lastName.text = savedLastName
        age.text = savedAge

        Glide.with(view)
            .load(savedUrl)
//            .placeholder(R.drawable.ic_baseline_account_box_24)
//            .centerCrop()
            .into(imageView)




    }

}