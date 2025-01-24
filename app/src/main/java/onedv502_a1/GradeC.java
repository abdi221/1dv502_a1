package onedv502_a1;

import java.util.ArrayList;
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

  // public void calculator(Scanner input) {
  //   Calculator calc = new Calculator();
  //   System.out.println("Welcome to basic calculator: \nInput two numbers:");
  //   System.out.print("First number: ");
  //   int firstNum = scanner.nextInt();
  //   System.out.print("Second number: ");
  //   int secondNum = scanner.nextInt();
  //   System.out.println("What operation (+, -, *, /) do you like to perform? ");
  //   String operation = scanner.nextLine();

  //   // TODO: create a while loop
  //   // based on the operation user chose, convert the variable to the desired datatype
  //   if (operation == "/") {
  //     System.out.println("The qoutent is " + calc.divide(firstNum, secondNum));
  //   } else if (operation == "+") {
  //     System.out.println("The sum of %d + %d = " + firstNum + secondNum
  //         + calc.add(firstNum, secondNum));
  //   } else if (operation == "-") {
  //     System.out.println("The difference between of %d and %d: " + firstNum + secondNum + " = " 
  //         + calc.subtract(firstNum, secondNum));
  //   } else if (operation == "*") {
  //     System.out.println("Multiplying  %d and %d would be " + firstNum + secondNum
  //         + calc.multiply(firstNum, secondNum));
  //   } else {
  //     System.out.println("Invalid operation.....");
  //   }
  // }

  /**
   * Solution to the 2D arrays task.
      * @throws InterruptedException 
      */
     public void arrays2D() throws InterruptedException {
    ArrayAlgorithms arryalgo = new ArrayAlgorithms();
    ArrayList<Integer> elements = new ArrayList<>();
    System.out.println("Enter the number of columns: ");
    int col = scanner.nextInt();
    System.out.println("Enter the number of rows");
    int rows = scanner.nextInt();

    // setting the rows and col of the array
    int[][] userArray = new int[rows][col];
    System.out.println("Give me some elements: ");
    elements.add(scanner.nextInt());
    for (int i = 0; i <= 3; i++) {
      try {
        if (i == 1) {
          int sum = arryalgo.sum(userArray);
          System.out.println("The sum of the elements in the array: " + sum);
        } else if (i == 2) {
          int[][] trans = arryalgo.transpose(userArray);
          System.out.println("The transposed elements of the array becomes " + trans);
        } else if (i == 3) {
          int dig = arryalgo.diagonalSum(userArray);
          System.out.println("The diagonl of the elements: " + dig);
        }
        Thread.sleep(3000);
        
      } catch (IllegalArgumentException e) {
        e.printStackTrace();

      }
    }
    

  }

  /**
   * Solution to the genre task.
   */
  public void band() {
  }
}
