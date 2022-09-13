package ua.ithillel.exceptions;

public class ArrayDataException extends NumberFormatException {

  private final int firstIndex;
  private final int secondIndex;

  public ArrayDataException(int firstIndex, int secondIndex) {
    this.firstIndex = firstIndex;
    this.secondIndex = secondIndex;
  }

  @Override
  public String getMessage() {
    return String.format("Exception in [%d][%d]", firstIndex, secondIndex);
  }
}
