package com.dogu.portfolio.admin.context.introduction.service

import com.dogu.portfolio.admin.data.TableDTO
import com.dogu.portfolio.domain.entity.Achievement
import com.dogu.portfolio.domain.entity.Introduction
import com.dogu.portfolio.domain.repository.IntroductionRepository
import org.springframework.stereotype.Service


@Service
class AdminIntroductionService(
    private val introductionRepository: IntroductionRepository
) {

    fun getIntroductionTable(): TableDTO {
        val classInfo = Introduction::class
        val entities = introductionRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}