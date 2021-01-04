package com.tamastudy.kotlinrestapi.transformer

import com.tamastudy.kotlinrestapi.domain.Person
import com.tamastudy.kotlinrestapi.dto.AddPersonRequest
import org.springframework.stereotype.Component

@Component
class AddPersonRequestTransformer: Transformer<AddPersonRequest, Person> {
    override fun transform(source: AddPersonRequest): Person {
        return Person(
                name = source.name,
                lastName = source.lastName
        )
    }
}