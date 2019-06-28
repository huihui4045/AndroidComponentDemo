package com.alizhezi.component.navigation

import android.content.res.Resources
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import com.alizhezi.component.base.BaseActivity
import com.alizhezi.component.R
import kotlinx.android.synthetic.main.activity_navigation.*

class NavigationActivity : BaseActivity() {
    private lateinit var appBarConfiguration : AppBarConfiguration

    override fun getLayoutId(): Int {
        return R.layout.activity_navigation
    }

    override fun initData() {
        super.initData()
        toolbar.title = title
    }

    override fun initView() {
        setSupportActionBar(toolbar)
        toolbar.visibility= View.GONE

        var host = my_nav_host_fragment as NavHostFragment

        val navController = host.navController

      //  appBarConfiguration = AppBarConfiguration(navController.graph)


       // setupActionBar(navController, appBarConfiguration)

        setupNavigationMenu(navController)

        setupBottomNavMenu(navController)


        navController.addOnDestinationChangedListener { _, destination, _ ->
            val dest: String = try {
                resources.getResourceName(destination.id)
            } catch (e: Resources.NotFoundException) {
                Integer.toString(destination.id)
            }

            Toast.makeText(this@NavigationActivity, "Navigated to $dest",
                Toast.LENGTH_SHORT).show()
            Log.d("NavigationActivity", "Navigated to $dest")
        }


    }

    override fun onSupportNavigateUp() =
        findNavController(this, R.id.my_nav_host_fragment).navigateUp()

    private fun setupBottomNavMenu(navController: NavController) {
        // TODO STEP 9.3 - Use NavigationUI to set up Bottom Nav
//        val bottomNav = findViewById<BottomNavigationView>(R.id.nav_view)

        // TODO END STEP 9.3
    }

    private fun setupNavigationMenu(navController: NavController) {
        // TODO STEP 9.4 - Use NavigationUI to set up a Navigation View
//        // In split screen mode, you can drag this view out from the left
//        // This does NOT modify the actionbar
       // val sideNavView = findViewById<NavigationView>(R.id.nav_view)
      //  sideNavView?.setupWithNavController(navController)
        // TODO END STEP 9.4
    }

    private fun setupActionBar(navController: NavController,
                               appBarConfig : AppBarConfiguration
    ) {
        // TODO STEP 9.6 - Have NavigationUI handle what your ActionBar displays
//        // This allows NavigationUI to decide what label to show in the action bar
//        // By using appBarConfig, it will also determine whether to
//        // show the up arrow or drawer menu icon
//        setupActionBarWithNavController(navController, appBarConfig)
        // TODO END STEP 9.6
    }
}
