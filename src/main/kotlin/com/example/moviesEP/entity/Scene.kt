package com.example.moviesEP.entity

import jakarta.persistence.*

@Entity
@Table(name = "scene")
class Scene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var description: String? = null
    var budget: Double? = null
    var minutes: Int? = null

    @ManyToOne
    @JoinColumn(name = "film_id")
    var film: Film? = null
}
