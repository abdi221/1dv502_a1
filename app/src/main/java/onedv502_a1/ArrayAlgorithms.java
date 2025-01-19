package onedv502_a1;

import java.util.Random;

import org.checkerframework.checker.units.qual.s;

/**
 * working with array and learning shi.
 *
 */
public class ArrayAlgorithms {
  private static final Random random = new Random();


  /**
   * finding the avg.
   *
   * @param averageValue holds all the elements.
   *
   * @return the avg element.
  */
  public double average(int[] averageValue) {
    int sum = 0;
    int length = averageValue.length;

    for (int i = 0; i < averageValue.length; i++) {
      sum += averageValue[i]; // adding togher every element in the array and then storing it in sum
    }
    if (length == 0) {
      throw new IllegalArgumentException("Cannot divide by 0");
    } else {
      double avg = (double) sum / length;
      return avg;
    }
  
    // Note to self:
    // Whenever you have a method expecting to operate a paramter on an array, 
    // you have to actually use that paramter in the method body. Before your method was
    // hardcoded to use the class's own array rather than whatever the was passed in from
    // the outside.
    // This is what the test was complaining about, it never got its own values factored into the average.
  
  
    // You learned:
    // - pass data into methods through parameters
    // - use those parameters rather than unrelated variable inside the method 

  }
  
  /**
   * determines the largest element in the array.
   *
   * @param valueMax holds all the elements.
   *
   * @return the biggest element.
   *
  */
  public int maxValue(int[] valueMax) {
    int max = valueMax[0];
    
    // traverse the  elements from second and compare with current max
    for (int i = 1; i < valueMax.length; i++) {
      max = valueMax[i];
    }
    return max;
     
  }

  /**
   * this method is findining the position of the smallest element.
   *
   * @param minIndx holds the elements.
   *
   *  @return the postion of the smallest index.
   *
  */
  public int minIndex(int[] minIndx) {

    int index =  0;
    int min = minIndx[index];

    for (int i = 1; i < minIndx.length; i++) {
      if (minIndx[i] <= min) {
        min = minIndx[i];
        index = i;
      }
    }
    return index;
  
    // Note to self:
    // -you need to keep track of the task that is specifically asking you to run
    // - know the difference between min value and min index; min-value mean the smallest
    // number  in the array itself. Min-index is the position where the smallest number is located 
   
  }

  /**
   * this method supposed to shift all the elements to the left.
   *
   * @param shiftingArray holds the elements.
   *
   *  @return a shifted elements to the left.
   *
  */
  public int[] shift(int[] shiftingArray) {
    int tempArrayElements = shiftingArray.length;  // length of the conveyor
    int firstElement = shiftingArray[0]; // the firsr box to the left that would have to reappear

    // you move one box to the left until you reach the left edge
    for (int i = 0; i < tempArrayElements - 1; i++) { // essentially you move a box from position i + 1 to i
      shiftingArray[i] = shiftingArray[i + 1];
    }
    // when the loop ends, the first box becomes the last and we  ended it there 
    shiftingArray[tempArrayElements - 1] = firstElement; 
    return shiftingArray; // returns the current conveyer structure
  }

  /**
   * supposed to randomly shuffle the elements.
   *
   * @param arrayShuffle holds the suppposed elements.
   *
   * @return a shuffled elements.
   *
   */
  public int[] shuffle(int[] arrayShuffle) {
    int shuffleElements = arrayShuffle.length;  

    for (int i = shuffleElements - 1; i > 0; i--) { // looking at the last card of the deck (i)
      // random index from 0 to i
      int indx = random.nextInt(i + 1);

  
      // imagine two cups of liquid that you want to exchange without spilling.
      // You need a third empty cup to hold the contents of the first cup temporarily:
      // 1. Pour the contents of Cup A into the spare cup.   
      // 2. Pour the contents of Cup B into Cup A.  
      // 3. Pour the contents from the spare cup into Cup B.
      // In code, `swapOnce` is like that third cup—somewhere to hold one 
      // value temporarily so you can swap the two values without losing any information.
    
      int swapOnce = arrayShuffle[i];
      arrayShuffle[i] = arrayShuffle[indx];
      arrayShuffle[indx] = swapOnce;
    }
    return arrayShuffle;
  }

  public int sum(int[][] sum) {
    int[][] array = {
                {5, 2}, {9, 8}, 
                {1, 3, 7,}, 
                {6, 4}
              };
    int totalSum = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        totalSum += array[i][j];
      }
    }
    return totalSum;

  }


}
