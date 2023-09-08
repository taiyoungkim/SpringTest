package com.tydev.springbootrestapi.mapper

import com.tydev.springbootrestapi.domain.TodoRequest
import com.tydev.springbootrestapi.domain.TodoResponse
import org.springframework.stereotype.Repository

@Repository
interface TodoMapper {

    /** To-Do 조회 */
    fun getTodos(todoRequest: TodoRequest): MutableList<TodoResponse>
}
