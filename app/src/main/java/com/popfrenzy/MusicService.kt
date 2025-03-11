package com.popfrenzy

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder as IBinder1

class MusicService : Service() {

    private val binder = MusicBinder()
    private lateinit var mediaPlayer: MediaPlayer
    private var isMuted = false

    override fun onCreate() {
        super.onCreate()
        mediaPlayer = MediaPlayer.create(this, R.raw.apa) // Replace with your music file
        mediaPlayer.isLooping = true
        mediaPlayer.start()
    }

    override fun onBind(intent: Intent?): IBinder1 {
        return binder
    }

    inner class MusicBinder : Binder() {
        fun getService(): MusicService = this@MusicService
    }

    fun mute() {
        if (!isMuted) {
            mediaPlayer.setVolume(0f, 0f)
            isMuted = true
        }
    }

    fun unmute() {
        if (isMuted) {
            mediaPlayer.setVolume(1f, 1f)
            isMuted = false
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}
