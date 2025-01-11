package onedv502_a1;


/**
 * Javadoc comment.
 */
public class ArrayAlgorithms {

  public double average(int[] averageValue) {
    int sum = 0;
    int length = averageValue.length;

    for (int i = 0; i < averageValue.length; i++) {
      sum += averageValue[i]; // adding togher every element in the array and then storing it in sum
    }
    double avg = sum / length;
    return avg;

  }

  


   
 

}
