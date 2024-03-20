package com.example.lab1_bondar

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class AnimalDetailActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_detail)

        val animalName = intent.getStringExtra("animal_name")
        val animalDescription = intent.getStringExtra("animal_description")

        val txtAnimalName = findViewById<TextView>(R.id.txtAnimalName)
        val txtAnimalDescription = findViewById<TextView>(R.id.txtAnimalDescription)

        txtAnimalName.text = animalName
        txtAnimalDescription.text = animalDescription
    }
}
