package com.zasa.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var selectedSkills = ""
    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
        println(league)
    }

    fun onBeginnerClicked(view: View){
        toggleBallerBtn.isChecked = false

        selectedSkills = "Beginner"
    }

    fun onBallerClicked(view: View){
        toggleBeginnerBtn.isChecked = false

        selectedSkills = "Baller"
    }
}