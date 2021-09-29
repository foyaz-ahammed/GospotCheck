package com.gospotcheck.android.gospotcheck.gscandroidinterview

import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


open class BaseActivity: AppCompatActivity() {


    override fun onResume() {
        super.onResume()

        itemsRecyclerView.visibility = View.GONE
    }
}