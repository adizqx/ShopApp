package com.example.shopapp.domain.usecases

import com.example.shopapp.domain.entity.GameResult
import com.example.shopapp.domain.entity.GameSettings
import com.example.shopapp.domain.entity.Level
import com.example.shopapp.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}