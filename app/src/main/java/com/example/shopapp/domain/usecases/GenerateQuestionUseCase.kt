package com.example.shopapp.domain.usecases

import com.example.shopapp.domain.entity.GameSettings
import com.example.shopapp.domain.entity.Question
import com.example.shopapp.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {
    operator fun invoke(maxSumValue: Int): Question {
       return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}