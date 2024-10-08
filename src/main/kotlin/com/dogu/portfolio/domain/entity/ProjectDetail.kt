package com.dogu.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class ProjectDetail(
    var content: String,
    var url: String?,
    var isActive: Boolean,
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_detail_id")
    var id: Long? = null
    // val achievement: Achievement
    // achievement.achievementId
    // achievement.id 로 사용하기 위해

    fun update(content: String, url: String?, isActive: Boolean) {
        this.content = content
        this.url = url
        this.isActive = isActive
    }
}