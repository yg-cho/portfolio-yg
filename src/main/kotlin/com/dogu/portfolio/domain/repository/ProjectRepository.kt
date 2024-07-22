package com.dogu.portfolio.domain.repository

import com.dogu.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ProjectRepository : JpaRepository<Project, Long> {

    fun findAllByIsActive(isActive: Boolean): List<Project>

    override fun findById(id: Long): Optional<Project>
}