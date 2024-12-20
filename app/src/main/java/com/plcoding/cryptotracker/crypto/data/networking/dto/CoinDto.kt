package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id: String,
    val rank: Int,
    val symbol: String,
    val name: String,
    val priceUsd: Double,
    val marketCapUsd: Double,
    val changePercent24Hr: Double
)
