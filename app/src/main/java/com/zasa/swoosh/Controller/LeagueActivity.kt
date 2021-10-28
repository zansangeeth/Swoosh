package com.zasa.swoosh.Controller
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.zasa.swoosh.EXTRA_LEAGUE
import com.zasa.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "mens"

    }

    fun onWomensClicked(view: View){

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "womens"
    }

    fun onCoedClicked(view: View){

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        selectedLeague = "CO-ED"
    }

    fun leagueNextClicked(view: View){
        if(selectedLeague != ""){
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivityIntent)
        }else {
            Toast.makeText(this, "please select a league", Toast.LENGTH_SHORT).show()
        }
    }

}