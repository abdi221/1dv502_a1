package onedv502_a1;


/**
 * Javadoc comment.
 */
public class ArrayAlgorithms {

  int[] values = {5, 2, 6, 4, 1, 3, 7, 9, 8};

  public double average(int[] averageValue) {
    int sum = 0;
    int lenght = values.length;

    for (int i = 0; i < values.length; i++) {
      sum += values[i];
    }
    double avg = sum / lenght;
    return avg;

  }
   
 

}
