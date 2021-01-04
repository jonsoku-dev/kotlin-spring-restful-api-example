package com.tamastudy.kotlinrestapi.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.SequenceGenerator

@Entity
data class Person(
        @Id
        @SequenceGenerator(name = PERSON_SEQUENCE, sequenceName = PERSON_SEQUENCE, initialValue = 1, allocationSize = 1)
        val id: Long? = 1L,
//        @Column(name = "name")
        var name: String = "",
//        @Column(name = "last_name")
        var lastName: String? = null
) {
    companion object {
        const val PERSON_SEQUENCE: String = "PERSON_SEQUENCE"
    }
}