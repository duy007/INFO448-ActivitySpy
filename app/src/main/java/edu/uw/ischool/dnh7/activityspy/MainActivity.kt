package edu.uw.ischool.dnh7.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("INFO","onCreate event fire with "
                + savedInstanceState.toString() + " as parameter")

    }

    override fun onDestroy() {
        Log.i("INFO","onDestroy event fire")
        Log.e("ERROR", "We're going down, Captain!")
        super.onDestroy()
    }

    override fun onResume() {
        super.onResume()
        Log.i("INFO","onResume event fire")

    }

    override fun onStart() {
        super.onStart()
        Log.i("INFO","onStart event fire")

    }
    override fun onStop() {
        super.onStop()
        Log.i("INFO","onStop event fire")

    }

}