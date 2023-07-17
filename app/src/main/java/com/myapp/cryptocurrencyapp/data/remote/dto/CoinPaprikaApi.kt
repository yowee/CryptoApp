package com.myapp.cryptocurrencyapp.data.remote.dto

import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinsById(@Path("coinId") coinId: String): CoinDetailDto
}