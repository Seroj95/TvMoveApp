package com.seroj.tvmoveapp.repository

import com.seroj.tvmoveapp.api.ApiService
import javax.inject.Inject

class TvShowRepository
@Inject
constructor(private val apiService: ApiService){
    suspend fun getTvShows() = apiService.getTvShows()

}