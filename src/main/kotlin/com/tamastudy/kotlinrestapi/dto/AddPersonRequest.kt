package com.tamastudy.kotlinrestapi.dto

data class AddPersonRequest(
        val name: String,
        val lastName: String? = null
)