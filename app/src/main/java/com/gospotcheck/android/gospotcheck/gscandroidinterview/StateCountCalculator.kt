package com.gospotcheck.android.gospotcheck.gscandroidinterview


class StateCountCalculator {

    fun getStateCounts(nationalParks: List<NationalPark>): List<StateCount> {
       return emptyList()
    }

}

data class StateCount(val state: String, val totalCount: Int, val parkCount: Int)