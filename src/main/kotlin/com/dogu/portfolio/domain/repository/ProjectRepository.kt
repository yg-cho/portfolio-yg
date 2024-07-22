package com.dogu.portfolio.domain.repository

import com.dogu.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long>