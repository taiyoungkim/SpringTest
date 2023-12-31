package com.tydev.springbootrestapi.web.controller

import com.tydev.springbootrestapi.domain.TodoRequest
import com.tydev.springbootrestapi.domain.TodoResponse
import com.tydev.springbootrestapi.service.TodoService
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.slf4j.LoggerFactory
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TodoController(
    val todoService: TodoService
) {

    private val log = LoggerFactory.getLogger(TodoController::class.java)

    /**
     * To-Do 조회
     */
    @PostMapping(
        value = ["/api/todos"],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE],
    )
    fun getTodos(
        request: HttpServletRequest,
        response: HttpServletResponse,
        @RequestBody todoRequest: TodoRequest
    ): MutableList<TodoResponse> {
        log.info("todoRequest:[{}]", todoRequest.toString())
        return todoService.getTodos(todoRequest)
    }
}