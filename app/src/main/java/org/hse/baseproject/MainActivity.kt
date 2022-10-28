package org.hse.baseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button_for_stud = findViewById<View>(R.id.button_for_stud)
        val button_for_prep = findViewById<View>(R.id.button_for_prep)
        button_for_stud.setOnClickListener { clickButtonForStud() }
        button_for_prep.setOnClickListener { clickButtonForPrep() }
    }

    private fun clickButtonForStud() {
        val text: CharSequence = getString(R.string.toast_rasp_for_stud)
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }

    private fun clickButtonForPrep() {
        val text: CharSequence = getString(R.string.toast_rasp_for_prep)
        val duration = Toast.LENGTH_SHORT
        val toast = Toast.makeText(applicationContext, text, duration)
        toast.show()
    }
}