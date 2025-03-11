package com.popfrenzy

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.media.MediaPlayer
import android.os.Bundle
import android.os.IBinder
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.enableEdgeToEdge

class MainActivity2 : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    private var isBound = false
    private lateinit var musicService: MusicService
    private lateinit var muteButton: ImageButton
    private var isMuted = false

    private val connection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            val binder = service as MusicService.MusicBinder
            musicService = binder.getService()
            isBound = true
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            isBound = false
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        // Start and bind the music service
        val intent = Intent(this, MusicService::class.java)
        startService(intent)
        bindService(intent, connection, Context.BIND_AUTO_CREATE)

        // Initialize MediaPlayer for button sounds
        mediaPlayer = MediaPlayer.create(this, R.raw.pop_sound)

        // Initialize buttons
        val button1: ImageButton = findViewById(R.id.buton1)
        val button2: ImageButton = findViewById(R.id.buton2)
        val button3: ImageButton = findViewById(R.id.buton3)
        val button4: ImageButton = findViewById(R.id.buton4)
        val button5: ImageButton = findViewById(R.id.buton5)
        val button6: ImageButton = findViewById(R.id.buton6)
        val button7: ImageButton = findViewById(R.id.buton7)
        val button8: ImageButton = findViewById(R.id.buton8)
        val button9: ImageButton = findViewById(R.id.buton9)
        val resetButton: ImageButton = findViewById(R.id.buton10)
        muteButton = findViewById(R.id.muteButton)

        // Create a list of buttons with initial states
        val buttons = listOf(button1, button2, button3, button4, button5, button6, button7, button8, button9)
        val defaultImage = R.drawable.buton1
        val pressedImage = R.drawable.buton2
        val buttonStates = mutableMapOf<ImageButton, Boolean>()

        // Initialize button states to false (not pressed)
        for (button in buttons) {
            buttonStates[button] = false
        }

        // Setup individual click listeners
        for (button in buttons) {
            button.setOnClickListener { view ->
                val imgButton = view as ImageButton
                if (!buttonStates[imgButton]!!) { // Only play sound if button has not been pressed
                    changeButtonAppearance(imgButton, pressedImage)
                    playSound()
                    buttonStates[imgButton] = true // Mark as pressed
                }
            }
        }

        // Setup reset button click listener
        resetButton.setOnClickListener {
            resetButtons(buttons, defaultImage, buttonStates)
        }

        // Setup mute/unmute button click listener
        muteButton.setOnClickListener {
            if (isBound) {
                if (isMuted) {
                    musicService.unmute()
                    muteButton.setImageResource(R.drawable.ic_volume) // Volume icon
                } else {
                    musicService.mute()
                    muteButton.setImageResource(R.drawable.ic_volume_off) // Mute icon
                }
                isMuted = !isMuted
            }
        }
    }

    private fun changeButtonAppearance(button: ImageButton, pressedImage: Int) {
        button.setImageResource(pressedImage)
    }

    private fun playSound() {
        mediaPlayer.start()
    }

    private fun resetButtons(buttons: List<ImageButton>, defaultImage: Int, buttonStates: MutableMap<ImageButton, Boolean>) {
        for (button in buttons) {
            button.setImageResource(defaultImage)
            buttonStates[button] = false // Reset button state to not pressed
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (isBound) {
            unbindService(connection)
        }
        mediaPlayer.release()
    }

    override fun onPause() {
        super.onPause()
        // Stop the music service when the activity is paused (minimized or closed)
        val intent = Intent(this, MusicService::class.java)
        stopService(intent)
    }

    override fun onResume() {
        super.onResume()
        // Restart the music service when the activity is resumed
        val intent = Intent(this, MusicService::class.java)
        startService(intent)
        bindService(intent, connection, Context.BIND_AUTO_CREATE)
    }
}