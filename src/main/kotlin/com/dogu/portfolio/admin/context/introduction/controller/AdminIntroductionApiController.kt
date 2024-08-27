package com.dogu.portfolio.admin.context.introduction.controller

import com.dogu.portfolio.admin.context.achievement.form.AchievementForm
import com.dogu.portfolio.admin.context.achievement.service.AdminAchievementService
import com.dogu.portfolio.admin.context.introduction.form.IntroductionForm
import com.dogu.portfolio.admin.context.introduction.service.AdminIntroductionService
import com.dogu.portfolio.admin.data.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/api/introduction")
class AdminIntroductionApiController (
    private val adminIntroductionService: AdminIntroductionService
) {

    @PostMapping
    fun postIntroduction(@RequestBody @Validated form: IntroductionForm): ResponseEntity<Any> {
        adminIntroductionService.save(form)

        return ApiResponse.successCreate()
    }

    @PutMapping("/{id}")
    fun putIntroduction(@PathVariable("id") id: Long, @RequestBody form: IntroductionForm): ResponseEntity<Any> {
        adminIntroductionService.update(id,form)

        return ApiResponse.successUpdate()
    }
}