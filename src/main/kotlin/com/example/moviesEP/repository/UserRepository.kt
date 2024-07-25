package com.example.moviesEP.repository

import com.example.moviesEP.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository <UserEntity, Long?> {
    fun findByUsername(username: String): UserEntity?

}