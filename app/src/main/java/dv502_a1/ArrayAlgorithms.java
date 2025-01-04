package assignmentone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Javadoc comment.
 */
public class ArrayAlgorithms {
  
  /**
   * Method to calculate the average of an array.
   */
  public double average(int[] array) {
    // Source: https://adevait.com/java/java-for-loops
    // Init a variable to hold the total sum
    int total = 0;
    for (int element : array) {
      total += element;
    }

    // return the avrg 
    return (double) total / array.length;
  }

  /**
   * This is Javadoc comment.
   */
  public int maxValue(int[] array) {
    
    // init a variable to hold the max value by starting with the first element and then loop each element
    int max = array[0];
    for (int element : array) {

      // check if the current element is greater or not to hold the max value
      if (element > max) {
        max = element;
      }
    }

    return max;
  }

  /**
   * This is Javadoc comment.
   */
  public int minIndex(int[] array) {
    int minIndex = 0;
    int min = array[0];
    //Loop through each index and element in the array
    for (int i = 0; i < array.length; i++) {
      if (array[i] < min) {
        min = array[i];
        minIndex = i;
      }
    }
    // Return the index
    return minIndex;
  }

  /**
   * This is Javadoc comment.
   */


  public int[] shuffle(int[] array) {
    // Create a new empty array to store shuffled elements
    int[] shuffledArray = new int[array.length];
    // Create a list to keep track of indices that have been used
    List<Integer> usedIndices = new ArrayList<>();
    // Initialize a Random object to generate random indices
    Random random = new Random();

    // Iterate over the array to shuffle its elements
    for (int i = 0; i < array.length; i++) {
      int randomIndex = random.nextInt(array.length);

      // Check if the random index has been used before
      while (usedIndices.contains(randomIndex)) {
        randomIndex = random.nextInt(array.length);
      }

      // Copy the element at the random index to the shuffled array
      shuffledArray[i] = array[randomIndex];

      // Add the random index to the list of used indices
      usedIndices.add(randomIndex);
    }

    return shuffledArray;
  }

  /**
   * This is Javadoc comment.
   */
  public int[] shift(int[] array) {
    int firstElement = array[0];
    // Shift all elements to the left
    for (int i = 1; i < array.length; i++) {
      array[i - 1] = array[i];
    }

    // Put  the first element at the end of the array
    array[array.length - 1] = firstElement;
    // Return the shifted array
    return array;
  }

}
