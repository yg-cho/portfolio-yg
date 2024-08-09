package com.dogu.portfolio.presentation.controller

import org.assertj.core.api.Assertions
import org.json.JSONArray
import org.json.JSONObject
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.MvcResult
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import java.nio.charset.StandardCharsets

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("[API 컨트롤러 테스트]")
class PresentationApiControllerTest(
    @Autowired private val mockMvc: MockMvc
) {
    @Test
    @DisplayName("Introductions")
    fun testGetIntroductions() {
        //given
        val uri = "/api/v1/introductions"

        //when
        val mvcResult = performGet(uri)
        val contentAsString = mvcResult.response.getContentAsString(StandardCharsets.UTF_8)
        val jsonArray = JSONArray(contentAsString)

        //then
        Assertions.assertThat(jsonArray.length()).isPositive()
    }

    @Test
    @DisplayName("links")
    fun testGetLinks() {
        //given
        val uri = "/api/v1/links"

        //when
        val mvcResult = performGet(uri)
        val contentAsString = mvcResult.response.getContentAsString(StandardCharsets.UTF_8)
        val jsonArray = JSONArray(contentAsString)

        //then
        Assertions.assertThat(jsonArray.length()).isPositive()
    }

    @Test
    @DisplayName("resume")
    fun testGetResume() {
        //given
        val uri = "/api/v1/resume"

        //when
        val mvcResult = performGet(uri)
        val contentAsString = mvcResult.response.getContentAsString(StandardCharsets.UTF_8)
        val jsonObject = JSONObject(contentAsString)

        //then
        Assertions.assertThat(jsonObject.optJSONArray("experiences").length()).isPositive()
        Assertions.assertThat(jsonObject.optJSONArray("achievements").length()).isPositive()
        Assertions.assertThat(jsonObject.optJSONArray("skills").length()).isPositive()

    }

    @Test
    @DisplayName("projects")
    fun testProjects() {
        //given
        val uri = "/api/v1/projects"

        //when
        val mvcResult = performGet(uri)
        val contentAsString = mvcResult.response.getContentAsString(StandardCharsets.UTF_8)
        val jsonArray = JSONArray(contentAsString)

        //then
        Assertions.assertThat(jsonArray.length()).isPositive()
    }


    private fun performGet(uri: String) : MvcResult {
        return mockMvc
            .perform(MockMvcRequestBuilders.get(uri))
            .andDo(MockMvcResultHandlers.print())
            .andReturn()
    }
}