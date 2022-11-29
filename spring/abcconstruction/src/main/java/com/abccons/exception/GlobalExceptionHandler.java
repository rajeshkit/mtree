package com.abccons.exception;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice  // 
public class GlobalExceptionHandler {
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorResponse> handleNullPointerException(NullPointerException ex) {
		ErrorResponse er=new ErrorResponse(new Date(), ex.getLocalizedMessage(), null);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
	}
	@ExceptionHandler(ConstructionNotFoundException.class)
	public ResponseEntity<ErrorResponse> handlerConstructionNotFound(Exception ex) {
		//return new ResponseEntity<>("Exception created: "+ex.getLocalizedMessage(),HttpStatus.BAD_REQUEST);//write this returned string in the responseBody	
		//return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Exception created: "+ex.getLocalizedMessage());
		ErrorResponse er=new ErrorResponse(new Date(), ex.getLocalizedMessage(), null);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
	}
	@ExceptionHandler(ArithmeticException.class)
	public ResponseEntity<ErrorResponse> handlerArithmeticException(Exception ex) {
		ErrorResponse er=new ErrorResponse(new Date(), ex.getLocalizedMessage(), null);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(er);
		
	}
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List<String>> handleMethodArgumentNotValid(MethodArgumentNotValidException ex) {
		List<FieldError> listOfErrors = ex.getFieldErrors();
		List<String> errors=new ArrayList<String>();
		for (FieldError fieldError : listOfErrors) {
				errors.add(fieldError.getDefaultMessage());	
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
		
		
	}
	
}
