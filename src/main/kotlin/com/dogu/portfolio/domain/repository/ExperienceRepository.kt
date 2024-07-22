package com.dogu.portfolio.domain.repository

import com.dogu.portfolio.domain.entity.Experience
import org.springframework.data.jpa.repository.JpaRepository

interface ExperienceRepository : JpaRepository<Experience, Long>