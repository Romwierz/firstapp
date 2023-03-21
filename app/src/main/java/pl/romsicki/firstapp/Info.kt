package pl.romsicki.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = getString(R.string.o_programie)
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        //actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}