package nl.novi.marijana.les12huiswerkservices.controllers;


import nl.novi.marijana.les12huiswerkservices.exceptions.RecordNotFoundException;
import nl.novi.marijana.les12huiswerkservices.exceptions.TelevisionNameTooLongException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//STEP1: annotation @ControllerAdvice
@ControllerAdvice
public class ExceptionController {

    //STEP2: annotation @ExceptionHandler + its value in the brackets
    @ExceptionHandler(value = RecordNotFoundException.class)
    public ResponseEntity<Object> exception(RecordNotFoundException exception) {

        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = IndexOutOfBoundsException.class)
    public ResponseEntity<Object> exception(IndexOutOfBoundsException exception) {

        return new ResponseEntity<>("This ID does not exist in the database", HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(value = TelevisionNameTooLongException.class)
    public ResponseEntity<Object> exception(TelevisionNameTooLongException exception) {

        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }


}
