package com.zasa.swoosh.Controller
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.zasa.swoosh.EXTRA_PLAYER
import com.zasa.swoosh.Model.Player
import com.zasa.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player  = Player("", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){

        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "mens"

    }

    fun onWomensClicked(view: View){

        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View){

        mensLeagueBtn.isChecked = false
        womensLeagueBtn.isChecked = false

        player.league = "CO-ED"
    }

    fun leagueNextClicked(view: View){
        if(player.league != ""){
            val skillActivityIntent = Intent(this, SkillActivity::class.java)
            skillActivityIntent.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivityIntent)
        }else {
            Toast.makeText(this, "please select a league", Toast.LENGTH_SHORT).show()
        }
    }

}