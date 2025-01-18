package onedv502_a1;

public class Calculator {
  
  /**
   * method that adds to integers.
   *
   * @param x first number.
   *
   *  @param y second numbe.
   * 
   * @return the sum of the two numbers.
   */
  public int addition(int x, int y) {
    return x + y;
  }

  /**
   * method that subs to integers.
   *
   * @param x first number.
   *
   * @param y second number.
   *
   * @return the difference of x and y.
   */
  public int subtraction(int x, int y) {
    return x - y;
  }

  /**
   * method for multiplying two integers.
   *
   * @param x is first term.
   *
   *  @param y is second term.
   *
   *  @return the product of the two.
   */
  public int multiplication(int x, int y) {
    return x * y;
  }

  /**
   * method for dividing two integers.
   *
   * @param x is divident.
   *
   * @param y is divisor.
   *
   * @return the quotent of the two integers.
   */
  public double division(double x, double y) {
    if (y == 0) {
      throw new IllegalArgumentException("The divisor cannot be 0");
    } else {
      return x / y;
    }
  }

}
