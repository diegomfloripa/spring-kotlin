package com.diego.fisrtk.service

import com.diego.fisrtk.service.domain.User
import com.diego.fisrtk.service.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val repository: UserRepository) {

    fun findAll() : List<User> {
        return repository.findAll()
    }

    fun save(user: User): User {
        return repository.save(user)
    }
}