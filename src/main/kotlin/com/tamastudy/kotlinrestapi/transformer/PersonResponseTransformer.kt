package com.tamastudy.kotlinrestapi.transformer

import com.tamastudy.kotlinrestapi.domain.Person
import com.tamastudy.kotlinrestapi.dto.PersonResponse

fun Person?.toPersonResponse(): PersonResponse {
    return PersonResponse(
            id = this?.id ?: 1L,
            fullName = "${this?.lastName} ${this?.name}"
    )
}