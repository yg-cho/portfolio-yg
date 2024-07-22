package com.dogu.portfolio.domain.repository

import com.dogu.portfolio.domain.entity.ProjectSkill
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectSkillRepository : JpaRepository<ProjectSkill, Long>