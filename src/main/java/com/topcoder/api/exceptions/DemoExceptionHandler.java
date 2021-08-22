package com.topcoder.api.exceptions;

import com.topcoder.api.entities.dtos.GenericResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * The type Demo exception handler.
 */
@ControllerAdvice
public class DemoExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Custom handle not found response entity.
     *
     * @param ex      the ex
     * @param request the request
     * @return the response entity
     */
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<GenericResponse> customHandleNotFound(Exception ex, WebRequest request) {
        return new ResponseEntity<>(new GenericResponse(ex.getMessage(), null), HttpStatus.NOT_FOUND);
    }

}
