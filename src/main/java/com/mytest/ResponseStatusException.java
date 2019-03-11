package com.mytest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * An example class annotated with ResponseStatus, used by the regression test to ensure that
 * uncaught exceptions whose class bears this annotation will have the correct http status and
 * message in the error response.
 */
@ResponseStatus(HttpStatus.CONFLICT)
public class ResponseStatusException extends RuntimeException {

  public ResponseStatusException(String message) {
    super(message);
  }
}
