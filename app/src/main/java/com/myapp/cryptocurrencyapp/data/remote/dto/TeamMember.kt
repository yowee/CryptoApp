package com.myapp.cryptocurrencyapp.data.remote.dto

import com.google.gson.annotations.SerializedName

class TeamMember(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String
)
