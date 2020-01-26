package com.choufleur.magicduck

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.choufleur.magicduck.helper.*
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.choufleur.magicduck.ui.main.SectionsPagerAdapter

class DayScheduleView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_schedule_view)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)
        var tasks = arrayOf<Task?>(ParseTasks("[\n" +//TODO has to be JsonArray idk how
                "  {\n" +
                "    \"name\":\"RandomEvent1\",\n" +
                "    \"duration\":300,\n" +
                "    \"priority\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent2\",\n" +
                "    \"duration\":40,\n" +
                "    \"priority\": 3\n" +
                "  },\n" +
                "  {\n" +
                "  \"name\":\"RandomEvent3\",\n" +
                "  \"duration\":60,\n" +
                "  \"priority\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent4\",\n" +
                "    \"duration\":45,\n" +
                "    \"priority\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent5\",\n" +
                "    \"duration\":20,\n" +
                "    \"priority\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent6\",\n" +
                "    \"duration\":20,\n" +
                "    \"priority\": 2\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent7\",\n" +
                "    \"duration\":75,\n" +
                "    \"priority\": 1\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent8\",\n" +
                "    \"duration\":15,\n" +
                "    \"priority\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent9\",\n" +
                "    \"duration\":60,\n" +
                "    \"priority\": 3\n" +
                "  },\n" +
                "  {\n" +
                "    \"name\":\"RandomEvent10\",\n" +
                "    \"duration\":25,\n" +
                "    \"priority\": 3\n" +
                "  }\n" +
                "]"))
        android.util.Log.v("TAG",tasks[2]?.name)


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }
}