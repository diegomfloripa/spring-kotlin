package com.diego.fisrtk.controller

import com.diego.fisrtk.controller.contract.UserContract
import com.diego.fisrtk.service.UserService
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("user")
class UserController(private val service: UserService) {

    @GetMapping
    fun getAll(): List<UserContract> = service.findAll().map( ::UserContract )

    @PostMapping
    fun create(@RequestBody @Valid userContract: UserContract): UserContract =
        userContract
                .let { it.toDomain() }
                .run { service.save(this) }
                .let { UserContract(it) }
}

