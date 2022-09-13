package ua.ithillel.exceptions;

public class ArraySizeException extends RuntimeException {

  @Override
  public String getMessage() {
    return "Exception: Array size isn't 4х4";
  }
}
