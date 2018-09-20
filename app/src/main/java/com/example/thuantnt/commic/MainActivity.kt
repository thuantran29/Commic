package com.example.thuantnt.commic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.example.thuantnt.commic.adapter.ViewTabAdapter
import com.example.thuantnt.commic.ui.home.NewCommic


class MainActivity : AppCompatActivity() {

    private var navigationView: NavigationView? = null
    private var viewPager: ViewPager? = null
    private var adapter: ViewTabAdapter? = null
    private var tabLayout: TabLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ViewTabAdapter(supportFragmentManager)
        viewPager?.adapter = adapter
        tabLayout?.setupWithViewPager(viewPager)
    }

}

