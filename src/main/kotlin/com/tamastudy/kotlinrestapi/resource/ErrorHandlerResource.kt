package com.tamastudy.kotlinrestapi.resource

import com.tamastudy.kotlinrestapi.dto.ErrorResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

/**
 * ControllerAdvice : 컨트롤러에서 나는 에러를 여기서 잡아줄 수 있다.
 * https://www.baeldung.com/exception-handling-for-rest-with-spring#controlleradvice
 */

@ControllerAdvice
class ErrorHandlerResource {
    /**
     * http://www.ezbocis.com/java-exception-jongryu/
     * IllegalStateException: 불법하거나 부적절한 시간에 메서드가 호출되었습니다
     */
    @ExceptionHandler(IllegalStateException::class)
    fun handleIllegalState(ex: IllegalStateException): ResponseEntity<ErrorResponse> {
        return ResponseEntity.badRequest().body(ErrorResponse(message = ex.localizedMessage))
    }
}