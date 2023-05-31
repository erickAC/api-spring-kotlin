package com.api.produto.config

import com.api.produto.models.ApiError
import com.api.produto.models.ObjectNotFoundException
import jakarta.servlet.http.HttpServletRequest
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import kotlin.reflect.KClass

@RestControllerAdvice
class ExceptionAdviceConfig {

    @ExceptionHandler(value = [ObjectNotFoundException::class])
    fun handlerObjectNotFoundException(http: HttpServletRequest, exception : ObjectNotFoundException): ResponseEntity<ApiError> {
        val apiError = ApiError(HttpStatus.NOT_FOUND.value(), http.servletPath);
        apiError.message = exception.message!!;
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
    }

}