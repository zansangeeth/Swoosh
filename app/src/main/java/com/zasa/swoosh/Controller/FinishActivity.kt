package com.zasa.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zasa.swoosh.EXTRA_PLAYER
import com.zasa.swoosh.Model.Player
import com.zasa.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player?.league} ${player?.skills} league near you..."
    }
}