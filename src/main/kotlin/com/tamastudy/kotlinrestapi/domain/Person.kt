package com.tamastudy.kotlinrestapi.domain

data class Person(
        val id: Long,
        val name: String = "",
        val lastName: String? = null
)