package org.hse.baseproject

import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.os.Bundle
import org.hse.baseproject.R
import android.widget.Spinner
import android.widget.ArrayAdapter
import android.widget.AdapterView
import android.content.ContentValues
import android.util.Log
import android.view.View
import java.text.SimpleDateFormat
import java.util.*
import kotlinx.serialization.*
import kotlinx.serialization.json.JSON

class TeacherActivity : AppCompatActivity() {
    private var teacher: TextView? = null
    private var status: TextView? = null
    private var subject: TextView? = null
    private var corp: TextView? = null
    private var cabinet: TextView? = null
    private var time: TextView? = null
    private var currentTime: Date? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)
        val spinner = findViewById<Spinner>(R.id.groupList)
        val groups: MutableList<Group> = ArrayList()
        initGroupList(groups)
        val adapter: ArrayAdapter<*> =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, groups)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                itemSelected: View, selectedItemPosition: Int, selectedId: Long
            ) {
                val item = adapter.getItem(selectedItemPosition)
                Log.d(ContentValues.TAG, "selectedItem: $item")
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {}
        }
        time = findViewById(R.id.time)
        initTime()
        status = findViewById(R.id.status)
        subject = findViewById(R.id.subject)
        cabinet = findViewById(R.id.cabinet)
        corp = findViewById(R.id.corp)
        teacher = findViewById(R.id.teacher)
        initData()
    }

    private fun initGroupList(groups: MutableList<Group>) {
        for (group in ){

        }
        groups.add(Group(1, "Преподаватель 1"))
        groups.add(Group(2, "Преподаватель 2"))
    }

    private fun initTime() {
        currentTime = Date()
        val simpleDateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        time!!.text = simpleDateFormat.format(currentTime)
    }

    private fun initData() {
        status!!.text = "Нет пар"
        subject!!.text = "Дисциплина"
        cabinet!!.text = "Кабинет"
        corp!!.text = "Корпус"
        teacher!!.text = "Преподаватель"
    }
}