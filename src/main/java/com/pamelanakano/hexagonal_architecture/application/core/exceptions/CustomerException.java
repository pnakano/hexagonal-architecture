package com.pamelanakano.hexagonal_architecture.application.core.exceptions;

public class CustomerException extends RuntimeException {
  public CustomerException(String message) {
    super(message);
  }
}
