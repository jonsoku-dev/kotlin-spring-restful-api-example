package com.tamastudy.kotlinrestapi.domain

data class Person(
        val id: Long? = 1L,
        var name: String = "",
        var lastName: String? = null
)