package com.zasa.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.zasa.swoosh.EXTRA_LEAGUE
import com.zasa.swoosh.EXTRA_SKILL
import com.zasa.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var selectedSkills = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEAGUE).toString()

    }

    fun onBeginnerClicked(view: View) {
        toggleBallerBtn.isChecked = false
        selectedSkills = "Beginner"
    }

    fun onBallerClicked(view: View) {
        toggleBeginnerBtn.isChecked = false
        selectedSkills = "Baller"
    }

    fun onSkillFinishClicked(view: View){

        if (selectedSkills != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, selectedSkills)
            startActivity(finishActivity)
        }else
            Toast.makeText(this, "please select the skills", Toast.LENGTH_SHORT).show()

    }
}