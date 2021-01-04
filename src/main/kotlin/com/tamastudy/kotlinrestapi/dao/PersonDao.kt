package com.tamastudy.kotlinrestapi.dao

import com.tamastudy.kotlinrestapi.domain.Person
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PersonDao : JpaRepository<Long, Person>