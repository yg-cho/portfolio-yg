package com.dogu.portfolio.domain.entity

import com.dogu.portfolio.domain.constant.SkillType
import jakarta.persistence.*

@Entity
class Skill(
    var name: String,
    var isActive: Boolean,
    type: String
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    var id: Long? = null
    // val achievement: Achievement
    // achievement.achievementId
    // achievement.id 로 사용하기 위해

    @Column(name= "skill_type")
    @Enumerated(value = EnumType.STRING)
    var type: SkillType = SkillType.valueOf(type)
}