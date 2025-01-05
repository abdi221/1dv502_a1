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
   * converting hours and minutes to seconds.
   */
  public void seconds() {
    Time time = new Time();

    System.out.print("Enter hours, minutes and seconds: ");
    int hour = scanner.nextInt();
    int min = scanner.nextInt();
    int sec = scanner.nextInt();
    int totalSeconds = time.toSeconds(hour, min, sec);
    System.out.println("In only seconds that is: " + totalSeconds);

  }

  /**
   * the main method to run the different tasks.
   *
   * @param args help to retrieve input from the console.
   *
   */
  public static void main(String[] args) {
    App app = new App();
    // app.hello();
    app.seconds();

      
  }

}
