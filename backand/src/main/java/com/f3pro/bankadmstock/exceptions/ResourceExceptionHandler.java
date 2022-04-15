package com.f3pro.bankadmstock.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandarError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String error = "Exeception Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        String messege = e.getMessage();
        StandarError err = new StandarError(Instant.now(),status.value(), error, messege, request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
    
}
