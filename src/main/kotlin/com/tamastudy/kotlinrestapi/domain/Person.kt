package com.tamastudy.kotlinrestapi.domain

import javax.persistence.*

@Entity
data class Person(
        @Id
        @SequenceGenerator(name = PERSON_SEQUENCE, sequenceName = PERSON_SEQUENCE, initialValue = 1, allocationSize = 1)
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PERSON_SEQUENCE)
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