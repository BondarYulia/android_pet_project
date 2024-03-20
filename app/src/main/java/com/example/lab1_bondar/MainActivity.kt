package com.example.lab1_bondar

import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.app.Activity

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAnimal1 = findViewById<Button>(R.id.btnAnimal1)
        val btnAnimal2 = findViewById<Button>(R.id.btnAnimal2)
        val btnAnimal3 = findViewById<Button>(R.id.btnAnimal3)

        btnAnimal1.setOnClickListener {
            val intent = Intent(this, AnimalDetailActivity::class.java)
            intent.putExtra("animal_name", "Кіт")
            intent.putExtra("animal_description", "Кіт — рід хижих ссавців родини котових (Felidae). У деяких старіших системах класифікації до нього зараховували всіх представників малих кішок (Felinae), проте зараз безпосередньо до роду відносяться лише кілька видів невеликих тварин, що мешкають у Євразії та Африці.")
            startActivity(intent)
        }

        btnAnimal2.setOnClickListener {
            val intent = Intent(this, AnimalDetailActivity::class.java)
            intent.putExtra("animal_name", "Ховрах")
            intent.putExtra("animal_description", "Ховрах — це рід ссавців з родини вивіркових (Sciuridae) ряду Мишоподібні (Muriformes) з надряду гризунів (Rodentia). Це малі рийні тварини з великими очима, маленькими вухами, міцними пазурами, короткими кінцівками й хвостом і зі щічними сумками. Живуть у Європі, Азії й Північній Америці.")
            startActivity(intent)
        }

        btnAnimal3.setOnClickListener {
            val intent = Intent(this, AnimalDetailActivity::class.java)
            intent.putExtra("animal_name", "Їжак")
            intent.putExtra("animal_description", "Їжак — один з 9-ти родів ссавців родини Їжакових (Erinaceidae). В Україні природно поширений по всій території білочеревий їжак, в окремих місцях сходу України зустрічається вухатий їжак. Окрім природніх мешканців, у якості садових тварин можуть утримуватись їжак європейський та як домашній улюбленець — карликовий африканський їжак.")
            startActivity(intent)
        }
    }
}