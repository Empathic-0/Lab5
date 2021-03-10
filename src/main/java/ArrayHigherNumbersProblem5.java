/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexander
 */
public class ArrayHigherNumbersProblem5 {
    public static void main(String[] args) {
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    System.out.println("count of numbers greater than n is : " + countHigherThan(intArray, 5));
  }

  public static int countHigherThan(int[] numArray, int n) {
    int count = 0;
    //loop through the numArray {
    for (int i = 0; i < numArray.length; i++) {
      //check to see if the number in any given iteration is > n
      if (numArray[i] > n){
        //then
        count++; 
      }
    }
    return count;
  }  
}
