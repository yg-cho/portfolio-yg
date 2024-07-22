package com.dogu.portfolio.domain.repository

import com.dogu.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface LinkRepository : JpaRepository<Link, Long>{

    fun findAllByIsActive(isActive: Boolean): List<Link>

    override fun findById(id: Long): Optional<Link>
}