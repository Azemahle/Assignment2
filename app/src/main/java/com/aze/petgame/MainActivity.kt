package com.aze.petgame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {



    private lateinit var Hunger: ProgressBar
    private lateinit var Happiness:ProgressBar
    private lateinit var Health:ProgressBar
    private lateinit var playButton: Button
    private lateinit var cleanButton : Button
    private lateinit var feedButton : Button
    private lateinit var petdog : ImageView

    private var hunger = 0
    private var happiness = 0
    private var health = 100

    fun hunger() {
        hunger +=20
        if(hunger<0) hunger =0
    }
    fun play() {
        happiness += 20
        hunger -= 10
        health +=10
        if (happiness > 100) happiness = 100
        if (health < 0) health =0
    }
    fun sleep () {
        hunger -=5
        health +=5
        happiness += 15
        if (happiness > 100) happiness = 100
        if (health < 0) health = 0
    }
    fun health () {
        hunger -= 2
        happiness += 2
        if (hunger < 0) health = 0
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        petdog = findViewById(R.id.petdog)
        Happiness= findViewById(R.id.happiness)
        Health= findViewById(R.id.health)
        Hunger = findViewById(R.id.Hunger)
        feedButton = findViewById(R.id.feedButton)
        playButton= findViewById(R.id.playButton)
        cleanButton= findViewById(R.id.cleanButton)

        feedButton.setOnClickListener {
            petdog.setImageResource(R.drawable.peteating)
        }

        cleanButton.setOnClickListener {
            petdog.setImageResource(R.drawable.petcleaning)
        }

        playButton.setOnClickListener {
            petdog.setImageResource(R.drawable.petplaying)
        }
    }
}



