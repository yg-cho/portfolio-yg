package com.dogu.portfolio.admin.context.achievement.controller

import com.dogu.portfolio.admin.context.achievement.form.AchievementForm
import com.dogu.portfolio.admin.context.achievement.service.AdminAchievementService
import com.dogu.portfolio.admin.data.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/api/achievements")
class AdminAchievementApiController(
    private val adminAchievementService: AdminAchievementService
) {

    @PostMapping
    fun postAchevement(@RequestBody @Validated form: AchievementForm): ResponseEntity<Any> {
        adminAchievementService.save(form)

        return ApiResponse.successCreate()
    }

    @PutMapping("/{id}")
    fun putAchevement(@PathVariable("id") id: Long, @RequestBody form: AchievementForm): ResponseEntity<Any> {
        adminAchievementService.update(id,form)

        return ApiResponse.successUpdate()
    }
}