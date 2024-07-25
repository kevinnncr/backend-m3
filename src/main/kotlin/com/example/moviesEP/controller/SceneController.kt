package com.example.moviesEP.controller

import com.example.moviesEP.entity.Scene
import com.example.moviesEP.service.SceneService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/scenes")
class SceneController {
    @Autowired
    lateinit var sceneService: SceneService

    @GetMapping
    fun list(): List<Scene> {
        return sceneService.list()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Scene {
        return sceneService.getById(id)
    }

    @PostMapping
    fun save(@RequestBody scene: Scene): Scene {
        return sceneService.save(scene)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody scene: Scene): Scene {
        return sceneService.update(id, scene)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): String {
        sceneService.delete(id)
        return "Scene with id $id deleted successfully"
    }
}
