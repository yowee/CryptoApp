package com.myapp.cryptocurrencyapp.domain.model

import com.myapp.cryptocurrencyapp.data.remote.dto.TeamMember

class CoinDetail(
    val id: String?,
    val name: String?,
    val description: String?,
    val symbol: String?,
    val rank: Int?,
    val active: Boolean?,
    val tags: List<String?>?,
    val team: List<TeamMember?>?
)