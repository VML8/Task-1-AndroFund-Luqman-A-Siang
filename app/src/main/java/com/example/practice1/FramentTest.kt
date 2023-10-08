package com.example.practice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FramentTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frament_test)

        val fragmentManager = supportFragmentManager
        val fragment1 = Fragment1()
        val fragment = fragmentManager.findFragmentByTag(Fragment1::class.java.simpleName)

        if (fragment !is Fragment1) {
            fragmentManager
                .beginTransaction()
                .add(R.id.container, fragment1, Fragment1::class.java.simpleName)

        }
    }
}