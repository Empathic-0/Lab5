/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class ArrayHigherNumbersProblem11 {
    
  public static void main(String[] args) {
    int[] numArray = { 1,2,3,4,5,6,7,8,9,10 };
    System.out.println(getTotal(numArray)); //55
    System.out.println(getAverage(numArray)); //5.5
    System.out.println(getHighest(numArray)); //10
    System.out.println(getLowest(numArray)); //1
  }


  public static int getTotal(int[] numArray) {
    int SumofTotal = 0;
    for (int i = 0 ; i < numArray.length; i++) {
      int currentNumber = numArray[i];
      SumofTotal = SumofTotal + currentNumber;
    }
    return SumofTotal;
  }

  public static double getAverage(int[] numArray) {
    // avg = sum / n
    double AvgofTotal = 0.0;
    AvgofTotal = (double) getTotal(numArray) / numArray.length;
    return AvgofTotal;
  }


  public static int getHighest(int[] numArray) {
    int max = numArray[0];
    for (int i = 1; i < numArray.length; i++) {
      int currentNumber = numArray[i];
      if (currentNumber > max) { 
        max = currentNumber;
      }
    }
    return max;
  }
  
  public static int getLowest(int[] numArray) {
    int low = numArray[0];
    for (int i = 1; i < numArray.length; i++) {
      int currentNumber = numArray[i];
      if (currentNumber < low) { 
        low = currentNumber;
      }
    }
    return low;
  }


    
}
