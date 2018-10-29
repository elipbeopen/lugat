package startapp.lugat.dictionary

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import startapp.lugat.R
import startapp.lugat.favorites.FavoritesFragment
import startapp.lugat.history.HistoryFragment

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    //Defining variables

    private val dictionaryFragment = DictionaryFragment()
    private val historyFragment = HistoryFragment()
    private val favoritesFragment = FavoritesFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Going to dictionary fragment when the app runs
        openFragment(dictionaryFragment)

        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.translation -> {
               openFragment(dictionaryFragment)
            }
            R.id.history -> {
                openFragment(historyFragment)
            }
            R.id.favorites -> {
                openFragment(favoritesFragment)
            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
// Method for opening fragment
    private fun openFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.mainLayout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
