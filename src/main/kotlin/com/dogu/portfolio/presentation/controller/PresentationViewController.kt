package com.dogu.portfolio.presentation.controller

import com.dogu.portfolio.domain.constant.SkillType
import org.springframework.ui.Model
import com.dogu.portfolio.presentation.service.PresentationService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PresentationViewController(
    private val presentationService: PresentationService
) {

    @GetMapping("/test")
    fun test(): String {
        return "test"
    }

    @GetMapping("/")
    fun index(model: Model): String {

        val introductions = presentationService.getIntroductions()
        model.addAttribute("introductions", introductions)

        val links = presentationService.getLinks()
        model.addAttribute("links", links)

        return "presentaion/index"
    }

    @GetMapping("/resume")
    fun resume(model: Model): String {
        val resume = presentationService.getResume()
        model.addAttribute("resume", resume)
        model.addAttribute("skillTypes", SkillType.entries.toTypedArray())

        return "presentaion/resume"
    }

    @GetMapping("/projects")
    fun projects(model: Model): String {
        val projects = presentationService.getProjects()
        model.addAttribute("projects", projects)

        return "presentaion/projects"
    }
}