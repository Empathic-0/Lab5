/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alexander
 */
public class ArrayHigherNumbersProblem5Test {
    
    public ArrayHigherNumbersProblem5Test() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ArrayHigherNumbersProblem5.main(args);
     
    }

    @Test
    public void testCountHigherThan() {
        System.out.println("countHigherThan");
        int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int n = 5;
        int expResult = 5;
        int result = ArrayHigherNumbersProblem5.countHigherThan(intArray, n);
        assertEquals(expResult, result);
    }
    
}
