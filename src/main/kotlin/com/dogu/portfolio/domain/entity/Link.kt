package com.dogu.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Link(
    var name: String,
    var content: String,
    var isActive: Boolean,
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "link_id")
    var id: Long? = null
    // val achievement: Achievement
    // achievement.achievementId
    // achievement.id 로 사용하기 위해
}