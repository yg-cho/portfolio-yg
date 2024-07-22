package com.dogu.portfolio.domain.repository

import com.dogu.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long>