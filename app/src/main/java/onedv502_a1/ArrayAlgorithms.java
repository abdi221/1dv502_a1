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

    /**
     * Note to self:
     * Whenever you have a method expecting to operate a paramter on an array, 
     * you have to actually use that paramter in the method body. Before your method was
     * hardcoded to use the class's own array rather than whatever the was passed in from
     * the outside.
     * This is what the test was complaining about, it never got its own values factored into the average.
     */
    /**
     * You learned:
     * - pass data into methods through parameters
     * - use those parameters rather than unrelated variable inside the method 
     */
  }
  
  public int maxValue(int[] valueMax) {
    int max = valueMax[0];

    // traverse the  elements from second and  compare with current max
    for (int i = 1; i < valueMax.length; i++) {
      max = valueMax[i];
    }
    return max;
     
  }
  


   
 

}
