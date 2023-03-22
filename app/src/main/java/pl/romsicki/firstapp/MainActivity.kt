package pl.romsicki.firstapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.TypedArrayUtils.getText
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // Set up drawer layout and toggle button
//        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_header)
//        val toggle = ActionBarDrawerToggle(
//            this,
//            drawerLayout,
//            R.string.navigation_drawer_open,
//            R.string.navigation_drawer_close
//        )
//        drawerLayout.addDrawerListener(toggle)
//        toggle.syncState()
//
//        // Set up navigation view and item listener
//        val navView = findViewById<NavigationView>(R.id.nav_view)
//        navView.setNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.nav_item_1 -> {
//                    // Handle click on navigation item 1
//                    true
//                }
//                R.id.nav_item_2 -> {
//                    // Handle click on navigation item 2
//                    true
//                }
//                else -> false
//            }
//        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.action_goto_activity -> {
                val switchActivityIntent = Intent(this, Info::class.java)
                startActivity(switchActivityIntent)

                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}