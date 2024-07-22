package com.dogu.portfolio.domain.repository

import com.dogu.portfolio.domain.entity.HttpInterface
import org.springframework.data.jpa.repository.JpaRepository

interface HttpInterfaceRepository : JpaRepository<HttpInterface, Long>