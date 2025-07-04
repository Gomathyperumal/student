package com.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {
@ExceptionHandler(NameNotFoundException.class)
public ResponseEntity<Object> NameNot(NameNotFoundException e){
	return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
}

@RestControllerAdvice
public class AgeException {
@ExceptionHandler(AgeNotFoundException.class)
public ResponseEntity<Object> AgeNot(AgeNotFoundException e){
return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
}
	
@RestControllerAdvice
public class IdException {
@ExceptionHandler(IdNotFoundException.class)
public ResponseEntity<Object> IdNot(IdNotFoundException  e){
return new ResponseEntity<Object>(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
}
}