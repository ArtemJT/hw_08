package ua.ithillel;

import ua.ithillel.exceptions.ArrayDataException;
import ua.ithillel.exceptions.ArraySizeException;

public class ArrayValueCalculator {

  public static void main(String[] args) {
    String[][] array = new String[4][4];
    array[0][1] = "1";
    array[1][2] = "1";
    array[2][1] = "1";
    array[2][2] = "string";
    array[3][2] = "1";

    int result = 0;
    try {
      result = doCalc(array);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Result: " + result);
    }
  }

  static int doCalc(String[][] array) {
    if (array.length != 4 || array[0].length != 4) {
      throw new ArraySizeException();
    }
    int result = 0;
      for (int y = 0; y < array.length; y++) {
        for (int x = 0; x < array[0].length; x++) {
          String s = array[y][x];
          if (s != null) {
            try {
              result += Integer.parseInt(s);
            } catch (NumberFormatException e) {
              throw new ArrayDataException(y, x);
            }
          }
        }
      }
    return result;
  }
}