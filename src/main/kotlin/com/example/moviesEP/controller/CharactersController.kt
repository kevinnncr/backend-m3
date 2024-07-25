package com.example.moviesEP.controller

import com.example.moviesEP.entity.Characters
import com.example.moviesEP.service.CharactersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/characters")
class CharactersController {
    @Autowired
    lateinit var charactersService: CharactersService

    @GetMapping
    fun list(): List<Characters> {
        return charactersService.list()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Characters {
        return charactersService.getById(id)
    }

    @PostMapping
    fun save(@RequestBody characters: Characters): Characters {
        return charactersService.save(characters)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody characters: Characters): Characters {
        return charactersService.update(id, characters)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): String {
        charactersService.delete(id)
        return "Character with id $id deleted successfully"
    }
}
