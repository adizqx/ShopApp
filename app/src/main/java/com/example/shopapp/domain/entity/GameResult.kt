package com.example.shopapp.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQustions: Int,
    val gameSettings: GameSettings
) : Parcelable