package com.example.viewpager.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.viewpager.R

class FragmentTwo : Fragment(R.layout.fragment_two) {

    private lateinit var nameEdit: EditText
    private lateinit var lastEdit: EditText
    private lateinit var urlEdit: EditText
    private lateinit var ageEdit: EditText
    private lateinit var submitButton: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEdit = view.findViewById(R.id.nameEditText)
        lastEdit = view.findViewById(R.id.lastNameEditText)
        urlEdit = view.findViewById(R.id.urlEditText)
        ageEdit = view.findViewById(R.id.ageEditText)
        submitButton = view.findViewById(R.id.button)

        submitButton.setOnClickListener {
            val nameInput = nameEdit.text.toString()
            val lastInput = lastEdit.text.toString()
            val urlInput = urlEdit.text.toString()
            val ageInput = ageEdit.text.toString()

            val sharedPref = this.activity!!.getSharedPreferences("sharedPrefs", Context.MODE_PRIVATE)

            val edit= sharedPref.edit()

            edit.apply() {
                putString("name", nameInput)
                putString("last", lastInput)
                putString("url",urlInput)
                putString("age", ageInput)
            }.apply()

        }

    }


}