package com.dogu.portfolio.domain.entity

import jakarta.persistence.*

@Entity
class Experience(
    title: String,
    description: String,
    startYear: Int,
    startMonth: Int,
    endYear: Int?,
    endMonth: Int?,
    isActive: Boolean
) : BaseEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_id")
    var id: Long? = null
    // val achievement: Achievement
    // achievement.achievementId
    // achievement.id 로 사용하기 위해

    var title: String = title

    var description: String = description

    var startYear: Int = startYear

    var startMonth: Int = startMonth

    var endYear: Int? = null

    var endMonth: Int? = null

    var isActive: Boolean = isActive

    @OneToMany(targetEntity = ExperienceDetail::class,
        fetch = FetchType.LAZY,
        cascade = [CascadeType.ALL]
    )
    @JoinColumn(name = "experience_id")
    var details: MutableList<ExperienceDetail> = mutableListOf()

    fun getEndYearMonth() : String {
        if (endYear == null || endMonth == null) {
            return "Present"
        }
        return "${endYear}.${endMonth}"
    }

    fun update(title: String, description: String, startYear: Int, startMonth: Int, endYear: Int?, endMonth: Int?, isActive: Boolean){
        this.title = title
        this.description = description
        this.startYear = startYear
        this.startMonth = startMonth
        this.endYear = endYear
        this.endMonth = endMonth
        this.isActive = isActive
    }

    fun addDetails(details: MutableList<ExperienceDetail>?) {
        if (details != null) {
            this.details.addAll(details)
        }
    }
}