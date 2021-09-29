package com.gospotcheck.android.gospotcheck.gscandroidinterview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val nationalParksAdapter = NationalParksAdapter()
    private val stateCountsAdapter = StateCountsAdapter()
    private val fetcher: NationalParksFetcher = InMemoryNationalParksFetcher()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        itemsRecyclerView.adapter = nationalParksAdapter

        swipeRefreshLayout.setOnRefreshListener {
//            makeRequest()
        }

        calculationsRecyclerView.adapter = stateCountsAdapter


    }

    private fun showToast(text: String) {
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_SHORT).show()
    }

    private fun fabClicked() {
        val stateCounts = StateCountCalculator().getStateCounts()
        stateCountsAdapter.setStateCounts(stateCounts)
        BottomSheetBehavior.from(bottomSheet).state = BottomSheetBehavior.STATE_EXPANDED
    }
}
