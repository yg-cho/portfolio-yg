package com.dogu.portfolio.admin.context.achievement.service

import com.dogu.portfolio.admin.data.TableDTO
import com.dogu.portfolio.domain.entity.Achievement
import com.dogu.portfolio.domain.repository.AchievementRepository
import org.springframework.stereotype.Service


@Service
class AdminAchievementService(
    private val achievementRepository: AchievementRepository
) {

    fun getAchievementTable(): TableDTO {
        val classInfo = Achievement::class
        val entities = achievementRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}