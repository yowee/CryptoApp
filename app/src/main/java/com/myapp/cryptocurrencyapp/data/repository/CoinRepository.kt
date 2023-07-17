package com.myapp.cryptocurrencyapp.data.repository

import com.myapp.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.myapp.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}