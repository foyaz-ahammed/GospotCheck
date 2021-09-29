package com.gospotcheck.android.gospotcheck.gscandroidinterview

import com.gospotcheck.android.gospotcheck.gscandroidinterview.api.retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.lang.Exception


class NationalParksApi {

    private fun getParks(callback: (NationalParksFetchResult) -> Unit) {
        val parksRetrofit: NationalParksRetrofit // create

        val call = parksRetrofit.getParks("National Park", 100)

    }

}

interface NationalParksRetrofit {
    /**
     * See [NationalParksRetrofit] for base url and other Retrofit setup
     * call to {baseUrl}/parks?q="{search}"&limit={limit}
     */
    fun getParks(/* queries go here */): Call<NationalParksResponseBody>
}

data class NationalParksResponseBody(val data: List<NationalPark>)

