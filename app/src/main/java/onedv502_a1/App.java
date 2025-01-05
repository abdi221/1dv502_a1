package onedv502_a1;

import java.util.Scanner;
// import org.checkerframework.checker.units.qual.min;

/**
 * This is the main class for the assignment.
 */
public class App {
  Scanner scanner = new Scanner(System.in, "UTF-8");

  /**
   * method that handles the greeting.
   */
  public void hello() {
    System.out.print("Name please: ");
    String name = scanner.nextLine();
    
    // instantiating the HelloThere class
    HelloThere instanceOfClass = new HelloThere();
    System.out.println(instanceOfClass.greeting(name));





  }

  /**
   * the main method to run the different tasks.
   *
   * @param args help to retrieve input from the console.
   *
   */
  public static void main(String[] args) {
    App app = new App();
    app.hello();

      
  }

}
