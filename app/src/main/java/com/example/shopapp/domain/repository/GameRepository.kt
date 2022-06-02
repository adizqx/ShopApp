package com.example.shopapp.domain.repository

import com.example.shopapp.domain.entity.GameSettings
import com.example.shopapp.domain.entity.Level
import com.example.shopapp.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}