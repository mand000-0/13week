package com.example.a13week

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.core.content.getSystemService

class App:Application() {
    companion object{
        const val  PROGRESS_CHANNEL_ID = "com.example.a13week"
    }

    override fun onCreate() {
        super.onCreate()

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            getSystemService(NotificationManager::class.java).run {
                val progressChannel = NotificationChannel(
                    PROGRESS_CHANNEL_ID,
                    "Progress Test",
                    NotificationManager.IMPORTANCE_LOW
                )
                createNotificationChannel(progressChannel)
            }
        }
    }
}