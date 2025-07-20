package com.example.dessertpusher.android

import android.app.Application
import timber.log.Timber

// NOTE: this is a global class, rarely touch this class as it can be very error prone

class PusherApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        // Set up Timber for logging
        Timber.plant(Timber.DebugTree())
    }
}