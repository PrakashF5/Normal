package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptedHandleControllerAdvice {
@ExceptionHandler(UserNotFoundException.class)
@ResponseStatus(value = HttpStatus.NOT_FOUND)

public @ResponseBody ExceptionUser handleUserNotFound(final UserNotFoundException e, final HttpServletRequest r) {
ExceptionUser error = new ExceptionUser();
error.setErrorMessage(e.getMessage());
error.callerURI(r.getRequestURI());
return error;

}
}
 