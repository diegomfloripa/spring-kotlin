package com.diego.fisrtk.service.domain

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.Transient
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(@Id val id: String? = null,
                val firstName: String,
                val lastName: String) {

    @Transient
    val fullname = "$firstName $lastName"
}
