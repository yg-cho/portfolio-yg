package com.dogu.portfolio.admin.context.skill.service

import com.dogu.portfolio.admin.data.TableDTO
import com.dogu.portfolio.domain.entity.Achievement
import com.dogu.portfolio.domain.entity.Introduction
import com.dogu.portfolio.domain.entity.Link
import com.dogu.portfolio.domain.entity.Skill
import com.dogu.portfolio.domain.repository.IntroductionRepository
import com.dogu.portfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service


@Service
class AdminSkillService(
    private val skillRepository: LinkRepository
) {

    fun getSkillTable(): TableDTO {
        val classInfo = Skill::class
        val entities = skillRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}