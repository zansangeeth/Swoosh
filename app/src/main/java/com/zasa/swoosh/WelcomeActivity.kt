package com.zasa.swoosh
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*


class WelcomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        get_started_button.setOnClickListener {
            var intent = Intent(this, LeagueActivity::class.java)
            startActivity(intent)
        }
    }
}