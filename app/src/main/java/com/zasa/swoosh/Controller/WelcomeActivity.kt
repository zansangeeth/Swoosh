package com.zasa.swoosh.Controller
import android.content.Intent
import android.os.Bundle
import com.zasa.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*


class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        get_started_button.setOnClickListener {
            var leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}