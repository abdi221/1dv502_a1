package onedv502_a1;

import java.util.ArrayList;
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
    System.out.println(instanceOfClass.hello(name));
  
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
   * method for the third task.
   */
  public void imInAband() {
    Album album = new Album("Wish you were ", 1975, "Pink Floyed");
    System.out.println(album.getName() + " here was relased " + album.getReleaseYear() + " by " + album.getArtist());
  }

  public void bestAlbumEver() {
    AlbumGenerator albumgen =  new AlbumGenerator();

    // creating array of the class album
    Album[] albums = albumgen.generateAlbums();

    for (Album album : albums) {
      System.out.println(album.getName() + "was released in " + album.getReleaseYear() + " by" + album.getArtist());
    }

  }

  public void workingWithArrays() {
    System.out.println("Give me a limit of how long the array is supposed to be:");
    int num = scanner.nextInt();
    ArrayList<Integer> elements = new ArrayList<>();
    ArrayAlgorithms arrayAlgo = new ArrayAlgorithms();

    for (int i = 0; i < num; i++) {
      System.out.println("Enter a number " + (i + 1) +  ": ");
      int userInput = scanner.nextInt();
      elements.add(userInput); // this adds every number from the user
    }

    
    int[] arrayFromList = new int[elements.size()];
    for (int i = 0; i < elements.size(); i++) {
      arrayFromList[i] = elements.get(i);
    }

    // computing average:
    double average = arrayAlgo.average(arrayFromList);
    System.out.println("The average of the elements of the array is: " + average);

    // finding the minIndex of the value 
    int minIndex = arrayAlgo.minIndex(arrayFromList);
    System.out.println("The index of the minimum value is" + minIndex);

    //shifting the array to the left and then shuffling the array randomly
    int[] shifting = arrayAlgo.shift(arrayFromList);
    System.out.println("Shifted to the left...: " + shifting);

    int[] shuffling = arrayAlgo.shuffle(arrayFromList);
    System.out.println("When shuffle the array: " + shuffling);

  
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
    // app.seconds();
    // app.imInABand();
    // app.bestAlbumEver();
    app.workingWithArrays();
      
  }

}
