package com.myapp.cryptocurrencyapp.presentation.coin_detail

import com.myapp.cryptocurrencyapp.domain.model.CoinDetail

class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""

)
