package com.example.shopapp.domain.entity

data class Question(
    val sum: Int,
    val visibelNumber: Int,
    val options: List<Int>
) {
    val rightAnswer: Int
    get() = sum - visibelNumber
}