package com.diego.fisrtk.controller.contract

import com.diego.fisrtk.service.domain.User
import javax.validation.constraints.NotBlank

data class UserContract(val id: String? = null,
                        @field:NotBlank val firstName: String? = null,
                        @field:NotBlank val lastName: String? = null) {

    constructor(user : User) :
            this(user.id, user.firstName, user.lastName)

    fun toDomain() = User(id, firstName!!, lastName!!)
}
