package com.tamastudy.kotlinrestapi.service

import com.tamastudy.kotlinrestapi.dao.PersonDao
import com.tamastudy.kotlinrestapi.dto.AddPersonRequest
import com.tamastudy.kotlinrestapi.dto.PersonResponse
import com.tamastudy.kotlinrestapi.dto.UpdatePersonRequest
import org.springframework.stereotype.Service

@Service
class PersonManagementServiceImpl(private val personDao: PersonDao): PersonManagementService {
    override fun findById(id: Long): PersonResponse? {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<PersonResponse> {
        TODO("Not yet implemented")
    }

    override fun save(addPersonRequest: AddPersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun update(updatePersonRequest: UpdatePersonRequest): PersonResponse {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }
}