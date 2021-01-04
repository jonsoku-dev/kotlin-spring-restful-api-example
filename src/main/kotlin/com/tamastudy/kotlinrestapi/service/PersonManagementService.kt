package com.tamastudy.kotlinrestapi.service

import com.tamastudy.kotlinrestapi.dto.AddPersonRequest
import com.tamastudy.kotlinrestapi.dto.PersonResponse
import com.tamastudy.kotlinrestapi.dto.UpdatePersonRequest

interface PersonManagementService {
    fun findById(id: Long): PersonResponse?
    fun findAll(): List<PersonResponse>
    fun save(addPersonRequest: AddPersonRequest): PersonResponse
    fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse
    fun delete(id: Long): Unit
}