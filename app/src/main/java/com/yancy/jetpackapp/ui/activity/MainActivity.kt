package com.yancy.jetpackapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.yancy.jetpackapp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host = main_fragment as NavHostFragment
        val navController = host.navController

        bottom_navigation_view.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            
            Log.e(
                "Yancy",
                "destination = ${destination.id}"
            )
        }

        bottom_navigation_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> navController.navigate(R.id.home)
                R.id.menu_task_market -> navController.navigate(R.id.task_market)
                R.id.menu_my_task -> navController.navigate(R.id.my_task)
                R.id.menu_mine -> navController.navigate(R.id.mine)
            }
            true
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        //return super.onSupportNavigateUp()
        return Navigation.findNavController(this, R.id.bottom_navigation_view).navigateUp()

    }

}
