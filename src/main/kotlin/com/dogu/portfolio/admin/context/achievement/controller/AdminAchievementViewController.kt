package com.dogu.portfolio.admin.context.achievement.controller

import com.dogu.portfolio.admin.context.achievement.service.AdminAchievementService
import com.dogu.portfolio.admin.data.DateFormElementDTO
import com.dogu.portfolio.admin.data.FormElementDTO
import com.dogu.portfolio.admin.data.TextFormElementDTO
import com.dogu.portfolio.admin.data.SelectFormElementDTO
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/admin/achievement")
class AdminAchievementViewController(
    private val adminAchievementService: AdminAchievementService
) {

    @GetMapping
    fun achievement(model: Model): String {
        val formElements = listOf<FormElementDTO>(
            TextFormElementDTO("title",4),
            TextFormElementDTO("description",8),
            DateFormElementDTO("achievedDate",8),
            TextFormElementDTO("host", 5),
            SelectFormElementDTO("isActive", 2, listOf(true.toString(), false.toString()))
        )
        model.addAttribute("formElements", formElements)

        val table = adminAchievementService.getAchievementTable()
        model.addAttribute("table", table)
        model.addAttribute("detailTable", null)

        val pageAttributes = mutableMapOf<String, Any>(
            Pair("menuName", "Resume"),
            Pair("pageName", table.name),
            Pair("editable", true),
            Pair("deletable", false),
            Pair("hadDetails", false)
        )
        model.addAllAttributes(pageAttributes)

        return "admin/page-table"
    }
}