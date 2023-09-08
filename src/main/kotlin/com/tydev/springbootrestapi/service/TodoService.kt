package com.tydev.springbootrestapi.service

import com.tydev.springbootrestapi.domain.TodoRequest
import com.tydev.springbootrestapi.domain.TodoResponse
import com.tydev.springbootrestapi.mapper.TodoMapper
import org.springframework.stereotype.Service

@Service
class TodoService(
    val todoMapper: TodoMapper
) {

    /** To-Do 조회  */
    fun getTodos(todoRequest: TodoRequest): MutableList<TodoResponse> {
        return todoMapper.getTodos(todoRequest)
    }
}