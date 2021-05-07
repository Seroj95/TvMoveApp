package com.seroj.tvmoveapp.di

import com.seroj.tvmoveapp.api.ApiService
import com.seroj.tvmoveapp.helper.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppiModule {
    @Provides
    fun provideBaseUrl()=Constant.BASE_URL
    @Provides
    @Singleton
    fun provideRetrofitInstance(BASE_URL:String):ApiService
    =Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)
}