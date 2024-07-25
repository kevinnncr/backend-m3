package com.example.moviesEP.repository

import com.example.moviesEP.entity.Characters
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CharactersRepository: JpaRepository<Characters, Long>
