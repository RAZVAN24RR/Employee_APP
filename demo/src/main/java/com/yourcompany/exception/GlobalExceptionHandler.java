package com.yourcompany.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler
    public ResponseEntity<?> handleGlobalException(Exception ex, WebRequest request){
        return new ResponseEntity<>("An eeror occured: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}