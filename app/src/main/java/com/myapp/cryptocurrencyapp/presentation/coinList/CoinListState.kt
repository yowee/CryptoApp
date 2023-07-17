package com.myapp.cryptocurrencyapp.presentation.coinList

import com.myapp.cryptocurrencyapp.domain.model.Coin

data class CoinListState(
    val isLoadinng: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)