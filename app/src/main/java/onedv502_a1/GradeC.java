package onedv502_a1;

import java.util.Scanner;

/**
 * This is the class for the C grade part of the assignment.\
 * Make sure you uncomment the corresponding test cases.
 */
public class GradeC {
  Scanner scanner = new Scanner(System.in, "UTF-8");
  /**
   * Solution to the calcutlator task.
   *
   * @param input is the scanner used to read input from the user.
   */

  public void calculator(Scanner input) {
    Calculator calc = new Calculator();
    System.out.println("Welcome to basic calculator: \nInput two numbers:");
    System.out.print("First number: ");
    int firstNum = scanner.nextInt();
    System.out.print("Second number: ");
    int secondNum = scanner.nextInt();
    System.out.println("What operation (+, -, *, /) do you like to perform? ");
    String operation = scanner.nextLine();

    // TODO: create a while loop
    // based on the operation user chose, convert the variable to the desired datatype
    if (operation == "/") {
      System.out.println("The qoutent is " + calc.divide(firstNum, secondNum));
    } else if (operation == "+") {
      System.out.println("The sum of %d + %d = " + firstNum + secondNum
          + calc.add(firstNum, secondNum));
    } else if (operation == "-") {
      System.out.println("The difference between of %d and %d: " + firstNum + secondNum + " = " 
          + calc.subtract(firstNum, secondNum));
    } else if (operation == "*") {
      System.out.println("Multiplying  %d and %d would be " + firstNum + secondNum
          + calc.multiply(firstNum, secondNum));
    } else {
      System.out.println("Invalid operation.....");
    }
  }

  /**
   * Solution to the 3D arrays task.
   */
  public void arrays2D() {

  }

  /**
   * Solution to the genre task.
   */
  public void band() {
  }
}
