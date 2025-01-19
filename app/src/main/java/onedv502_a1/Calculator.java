package onedv502_a1;


public class Calculator {
  private boolean divideByZero; 
  /**
   * method that adds to integers.
   *
   * @param x first number.
   *
   *  @param y second numbe.
   * 
   * @return the sum of the two numbers.
   */
  public double add(double x, double y) {
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
  public double subtract(double x, double y) {
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
  public double multiply(double x, double y) {
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
  public double divide(double x, double y) {
    divideByZero = (y == 0); 
    if (divideByZero) {
      return 0.0;
    }
    return x / y;
    }
  
  public boolean isDivideByZero() {
    return divideByZero;
  }
  // Good design involves:
  // storing results of conditions that affect state
  // keeping methods simple and predictable by seperating state-setting (divide()) and
  // state-checking (isDivisable()) 
}
