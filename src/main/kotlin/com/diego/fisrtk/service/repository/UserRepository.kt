package com.diego.fisrtk.service.repository

import com.diego.fisrtk.service.domain.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String> {
}