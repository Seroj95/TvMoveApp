package com.seroj.tvmoveapp.api

import com.seroj.tvmoveapp.helper.Constant
import com.seroj.tvmoveapp.model.TvShowItem
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(Constant.END_POINT )
    suspend fun getTvShows():Response<TvShowItem>

}