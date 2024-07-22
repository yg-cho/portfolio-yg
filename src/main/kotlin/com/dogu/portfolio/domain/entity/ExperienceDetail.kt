package com.dogu.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ExperienceDetail(
    var content: String,
    var isActive: Boolean,
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    var id: Long? = null
    // val achievement: Achievement
    // achievement.achievementId
    // achievement.id 로 사용하기 위해

    fun update(content: String, isActive: Boolean) {
        this.content = content
        this.isActive = isActive
    }
}