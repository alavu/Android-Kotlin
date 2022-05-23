package com.tutorials.eu.favdish.view.activities

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.tutorials.eu.favdish.R
import com.tutorials.eu.favdish.databinding.ActivityAddUpdateDishBinding
import com.tutorials.eu.favdish.databinding.DialogCustomImageSelectionBinding

/**
 * A screen where we can add and update the dishes.
 */
class AddUpdateDishActivity : AppCompatActivity(), View.OnClickListener {

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
        mBinding.ivAddDishImage.setOnClickListener(this)
    }

    // TODO Step 7: Create a function to setup the ActionBar
    // START
    private fun setupActionBar() {
        setSupportActionBar(mBinding.toolbarAddDishActivity)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        mBinding.toolbarAddDishActivity.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.iv_add_dish_image -> {
                    customimageSelectionDialog()
                    return
                }
            }
        }
    }
    // END

    private fun customimageSelectionDialog() {
        val dialog = Dialog(this)
        val binding: DialogCustomImageSelectionBinding =
            DialogCustomImageSelectionBinding.inflate(layoutInflater)
        dialog.setContentView(binding.root)
        dialog.show()
        binding.tvCamera.setOnClickListener() {
            Toast.makeText(this, "Camera Clicked", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        binding.tvGallery.setOnClickListener() {
            Toast.makeText(this, "Gallery Clicked", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
    }
}