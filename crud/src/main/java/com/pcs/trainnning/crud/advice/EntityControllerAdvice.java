package com.pcs.trainnning.crud.advice;

import com.pcs.trainnning.crud.exception.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EntityControllerAdvice {

    @ExceptionHandler({EntityNotFoundException.class})
    public ResponseEntity<String> handleEntityNotFoundException(){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
