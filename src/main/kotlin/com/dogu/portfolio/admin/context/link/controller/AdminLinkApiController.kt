package com.dogu.portfolio.admin.context.link.controller

import com.dogu.portfolio.admin.context.achievement.form.AchievementForm
import com.dogu.portfolio.admin.context.achievement.service.AdminAchievementService
import com.dogu.portfolio.admin.context.introduction.form.IntroductionForm
import com.dogu.portfolio.admin.context.introduction.service.AdminIntroductionService
import com.dogu.portfolio.admin.context.link.form.LinkForm
import com.dogu.portfolio.admin.context.link.service.AdminLinkService
import com.dogu.portfolio.admin.data.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/api/link")
class AdminLinkApiController (
    private val adminLinkService: AdminLinkService
) {

    @PostMapping
    fun postIntroduction(@RequestBody @Validated form: LinkForm): ResponseEntity<Any> {
        adminLinkService.save(form)

        return ApiResponse.successCreate()
    }

    @PutMapping("/{id}")
    fun putIntroduction(@PathVariable("id") id: Long, @RequestBody form: LinkForm): ResponseEntity<Any> {
        adminLinkService.update(id,form)

        return ApiResponse.successUpdate()
    }
}