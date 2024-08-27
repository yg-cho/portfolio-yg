package com.dogu.portfolio.admin.context.skill.controller

import com.dogu.portfolio.admin.context.skill.form.SkillForm
import com.dogu.portfolio.admin.context.skill.service.AdminSkillService
import com.dogu.portfolio.admin.data.ApiResponse
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/admin/api/skill")
class AdminSkillApiController (
    private val adminSkillService: AdminSkillService
) {

    @PostMapping
    fun postIntroduction(@RequestBody @Validated form: SkillForm): ResponseEntity<Any> {
        adminSkillService.save(form)

        return ApiResponse.successCreate()
    }

    @PutMapping("/{id}")
    fun putIntroduction(@PathVariable("id") id: Long, @RequestBody form: SkillForm): ResponseEntity<Any> {
        adminSkillService.update(id,form)

        return ApiResponse.successUpdate()
    }
}