package com.tamastudy.kotlinrestapi.domain

data class Person(
        val id: Long? = 1L,
        val name: String = "",
        val lastName: String? = null
)