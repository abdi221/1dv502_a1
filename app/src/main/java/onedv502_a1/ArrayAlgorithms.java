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
    
    // traverse the  elements from second and compare with current max
    for (int i = 1; i < valueMax.length; i++) {
      max = valueMax[i];
    }
    return max;
     
  }

  public int minIndex(int[] minValue) {
    
    int index =  0;
    int min = minValue[index];

    for (int i = 1; i < minValue.length; i++) {
      if (minValue[i] <= min) {
        min = minValue[i];
        index = i;
      }
    }
    return index;
    /**
     * Note to self:
     * you need to keep track of the task is specifically asking you to run
     * know the difference between min value and min index; min-value mean the smallest
     * number  in the array itself. Min-index is the position where the smallest number is located 
     */
  }

  public int[] shift(int[] shiftingArray) {
    int tempArrayElements = shiftingArray.length;  
    int firstElement = shiftingArray[0];

    for (int i = 0; i < tempArrayElements - 1; i++) {
      shiftingArray[i] = shiftingArray[i + 1];
    }
    shiftingArray[tempArrayElements - 1] = firstElement;
    for (int i = 0; i < tempArrayElements; i++) {
      System.out.println(shiftingArray[i] + "");
    }
    return shiftingArray;

    
  }


}
