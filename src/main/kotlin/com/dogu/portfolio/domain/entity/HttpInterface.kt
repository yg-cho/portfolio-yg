package com.dogu.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class HttpInterface : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "http_interface_id")
    var id: Long? = null
    // val achievement: Achievement
    // achievement.achievementId
    // achievement.id 로 사용하기 위해
}