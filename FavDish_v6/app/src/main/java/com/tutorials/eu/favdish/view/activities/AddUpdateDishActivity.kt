package com.tutorials.eu.favdish.view.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tutorials.eu.favdish.R
import com.tutorials.eu.favdish.databinding.ActivityAddUpdateDishBinding

/**
 * A screen where we can add and update the dishes.
 */
class AddUpdateDishActivity : AppCompatActivity() {

    // TODO Step 5: Create a global variable for layout ViewBinding
    // START
    private lateinit var mBinding: ActivityAddUpdateDishBinding
    // END

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO Step 6: Initialize the layout ViewBinding variable and set the contentView.
        // START
        mBinding = ActivityAddUpdateDishBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        // END

        // TODO Step 8: Call the method of setupActionBar
        // START
        setupActionBar()
        // END
    }

    // TODO Step 7: Create a function to setup the ActionBar
    // START
    private fun setupActionBar() {
        setSupportActionBar(mBinding.toolbarAddDishActivity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        mBinding.toolbarAddDishActivity.setNavigationOnClickListener { onBackPressed() }
    }
    // END

}