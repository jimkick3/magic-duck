package com.choufleur.magicduck

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_employee_properties_input.*
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class EmployeePropertiesInputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_properties_input)
        toolbar.setTitle("Preferences")
        toolbar.setSubtitle("Tell us a bit about your day")

        setSupportActionBar(toolbar)
        val intentI = Intent(this, DayScheduleView::class.java)
        //TODO : intentI.putExtra(genSchedule(prodTime, lunchTime)::schedule)

        fab.setOnClickListener {
            startActivity(intentI)
        }


    }
}