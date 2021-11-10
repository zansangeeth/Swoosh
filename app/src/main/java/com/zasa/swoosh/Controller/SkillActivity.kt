package com.zasa.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.zasa.swoosh.EXTRA_PLAYER
import com.zasa.swoosh.Model.Player
import com.zasa.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
    }

    fun onBeginnerClicked(view: View) {
        toggleBallerBtn.isChecked = false
        player.skills = "Beginner"
    }

    fun onBallerClicked(view: View) {
        toggleBeginnerBtn.isChecked = false
        player.skills = "Baller"
    }

    fun onSkillFinishClicked(view: View){

        if (player.skills != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER,player)
            startActivity(finishActivity)
        }else
            Toast.makeText(this, "please select the skills", Toast.LENGTH_SHORT).show()

    }
}