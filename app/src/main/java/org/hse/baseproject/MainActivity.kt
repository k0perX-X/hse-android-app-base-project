package org.hse.baseproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonForStudent = findViewById<View>(R.id.button_for_stud)
        val buttonForTeacher = findViewById<View>(R.id.button_for_prep)
        buttonForStudent.setOnClickListener { clickButtonForStudent() }
        buttonForTeacher.setOnClickListener { clickButtonForTeacher() }
    }

    private fun clickButtonForStudent() {
//        val text: CharSequence = getString(R.string.toast_rasp_for_stud)
//        val duration = Toast.LENGTH_SHORT
//        val toast = Toast.makeText(applicationContext, text, duration)
//        toast.show()
        showStudentActivity()
    }

    private fun clickButtonForTeacher() {
//        val text: CharSequence = getString(R.string.toast_rasp_for_prep)
//        val duration = Toast.LENGTH_SHORT
//        val toast = Toast.makeText(applicationContext, text, duration)
//        toast.show()
        showTeacherActivity()
    }

    private fun showStudentActivity() {
        intent = Intent(this, StudentActivity::class.java)
        startActivity(intent)
    }

    private fun showTeacherActivity() {
        intent = Intent(this, TeacherActivity::class.java)
        startActivity(intent)
    }
}