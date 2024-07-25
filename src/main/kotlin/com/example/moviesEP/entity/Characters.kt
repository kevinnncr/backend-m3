package com.example.moviesEP.entity

import jakarta.persistence.*

@Entity
@Table(name = "characters")
class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var fullname: String? = null
    var description: String? = null
    var cost: Double? = null
    var stock: Int? = null

    @ManyToOne
    @JoinColumn(name = "scene_id")
    var scene: Scene? = null
}
