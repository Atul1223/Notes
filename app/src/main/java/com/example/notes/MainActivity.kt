package com.example.notes

import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.VectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.*
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_login.*


class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setNavHostNavController()
        changeFragment()
    }
    private fun changeFragment() {
        if(checkLoginUser()){
            navController.navigate(R.id.homeFragment)
        }
        else{
            navController.navigate(R.id.loginFragment)
        }
    }

    private fun checkLoginUser(): Boolean {
        return false
    }

    private fun setNavHostNavController() {
        navHostFragment = supportFragmentManager.findFragmentById(R.id.main_fragment) as NavHostFragment
        navController =  navHostFragment.navController
    }
}