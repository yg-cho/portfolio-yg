package com.dogu.portfolio.presentation.dto

import com.dogu.portfolio.domain.entity.Introduction

data class IntroductionDTO (
    val content: String,
) {
    constructor(introduction: Introduction) : this(
        content = introduction.content
    )
}