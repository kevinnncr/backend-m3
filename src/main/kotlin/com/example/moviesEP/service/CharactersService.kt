package com.example.moviesEP.service

import com.example.moviesEP.entity.Characters
import com.example.moviesEP.repository.CharactersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CharactersService {
    @Autowired
    lateinit var charactersRepository: CharactersRepository

    fun list(): List<Characters> {
        return charactersRepository.findAll()
    }

    fun getById(id: Long): Characters {
        return charactersRepository.findById(id).orElseThrow { RuntimeException("Character not found") }
    }

    fun save(characters: Characters): Characters {
        return charactersRepository.save(characters)
    }

    fun update(id: Long, characters: Characters): Characters {
        val existingCharacters = charactersRepository.findById(id).orElseThrow { RuntimeException("Character not found") }
        existingCharacters.fullname = characters.fullname
        existingCharacters.description = characters.description
        existingCharacters.cost = characters.cost
        existingCharacters.stock = characters.stock
        existingCharacters.scene = characters.scene
        return charactersRepository.save(existingCharacters)
    }

    fun delete(id: Long) {
        if (charactersRepository.existsById(id)) {
            charactersRepository.deleteById(id)
        } else {
            throw RuntimeException("Character not found")
        }
    }
}
