package com.myapp.cryptocurrencyapp.di

import com.myapp.cryptocurrencyapp.common.Constants
import com.myapp.cryptocurrencyapp.data.remote.dto.CoinPaprikaApi
import com.myapp.cryptocurrencyapp.data.repository.CoinRepository
import com.myapp.cryptocurrencyapp.data.repository.CoinRepositoryImplementation
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun providesPaprikaApi(): CoinPaprikaApi {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPaprikaApi::class.java)
    }

    @Provides
    @Singleton
    fun providesCoinRepository(api: CoinPaprikaApi): CoinRepository {
        return CoinRepositoryImplementation(api)
    }


}