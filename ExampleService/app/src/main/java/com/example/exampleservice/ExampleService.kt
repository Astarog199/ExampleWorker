package com.example.exampleservice

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ExampleService :Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        Log.d("ExampleService", "Create Service")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("ExampleService", "Start Service")
        Thread.sleep(3000)
        stopSelf()
        return START_NOT_STICKY
    }


    override fun onDestroy() {
        Log.d("ExampleService", "onDestroy Service")
    }
}