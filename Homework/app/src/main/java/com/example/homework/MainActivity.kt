package com.example.homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(MainActivity::class.java.name, "onCreate")

    }

    override fun onStart() {
        super.onStart()

        Log.e(MainActivity::class.java.name, "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.e(MainActivity::class.java.name, "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.e(MainActivity::class.java.name, "onPause")
    }

    override fun onStop() {
        super.onStop()

        Log.e(MainActivity::class.java.name, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.e(MainActivity::class.java.name, "onDestroy")
    }

}