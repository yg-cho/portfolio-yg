package com.dogu.portfolio.admin.context.link.service

import com.dogu.portfolio.admin.data.TableDTO
import com.dogu.portfolio.domain.entity.Achievement
import com.dogu.portfolio.domain.entity.Introduction
import com.dogu.portfolio.domain.entity.Link
import com.dogu.portfolio.domain.repository.IntroductionRepository
import com.dogu.portfolio.domain.repository.LinkRepository
import org.springframework.stereotype.Service


@Service
class AdminLinkService(
    private val linkRepository: LinkRepository
) {

    fun getLinkTable(): TableDTO {
        val classInfo = Link::class
        val entities = linkRepository.findAll()

        return TableDTO.from(classInfo, entities)
    }
}