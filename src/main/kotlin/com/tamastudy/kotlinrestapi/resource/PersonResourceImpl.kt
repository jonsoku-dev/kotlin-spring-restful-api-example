package com.tamastudy.kotlinrestapi.resource

import com.tamastudy.kotlinrestapi.dto.AddPersonRequest
import com.tamastudy.kotlinrestapi.dto.PersonResponse
import com.tamastudy.kotlinrestapi.dto.UpdatePersonRequest
import com.tamastudy.kotlinrestapi.resource.PersonResourceImpl.Companion.BASE_PERSON_URL
import com.tamastudy.kotlinrestapi.service.PersonManagementService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping(value = [BASE_PERSON_URL])
class PersonResourceImpl(
        private val personManagementService: PersonManagementService
) : PersonResource {

    @GetMapping("/{id}")
    override fun findById(@PathVariable id: Long): ResponseEntity<PersonResponse?> {
        val personResponse = this.personManagementService.findById(id)
        return ResponseEntity.status(HttpStatus.OK).body(personResponse)
    }

    @GetMapping
    override fun findAll(): ResponseEntity<List<PersonResponse>> = ResponseEntity.ok(this.personManagementService.findAll())

    @PostMapping
    override fun save(@RequestBody addPersonRequest: AddPersonRequest): ResponseEntity<PersonResponse> {
        val personResponse = this.personManagementService.save(addPersonRequest)
        return ResponseEntity
                .created(URI.create(BASE_PERSON_URL.plus("/${personResponse.id}")))
                .body(personResponse)
    }

    @PutMapping
    override fun update(@RequestBody updatePersonRequest: UpdatePersonRequest): ResponseEntity<PersonResponse> {
        return ResponseEntity.ok(this.personManagementService.update(updatePersonRequest))
    }

    @DeleteMapping
    override fun deleteById(id: Long): ResponseEntity<Unit> {
        this.personManagementService.deleteById(id)
        return ResponseEntity.noContent().build()
    }

    companion object {
        const val BASE_PERSON_URL: String = "/api/v1/person"
    }
}