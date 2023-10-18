package edu.uw.ischool.lwong121.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String = "ActivitySpy";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate event fired. savedInstanceState parameter: ${savedInstanceState.toString()}");

        setContentView(R.layout.activity_main)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy event fired");
        Log.e(TAG, "We're going down, Captain!");
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart event fired");
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop event fired");
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause event fired");
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume event fired");
    }
}