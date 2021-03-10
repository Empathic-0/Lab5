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
public class ArrayHigherNumbersProblem11Test {
    
    public ArrayHigherNumbersProblem11Test() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ArrayHigherNumbersProblem11.main(args);
        
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        int[] numArray = { 1,2,3,4,5,6,7,8,9,10 };
        int expResult =55;
        int result = ArrayHigherNumbersProblem11.getTotal(numArray);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        int[] numArray = { 1,2,3,4,5,6,7,8,9,10 };
        double expResult = 5.5;
        double result = ArrayHigherNumbersProblem11.getAverage(numArray);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        int[] numArray = { 1,2,3,4,5,6,7,8,9,10 };
        int expResult = 10;
        int result = ArrayHigherNumbersProblem11.getHighest(numArray);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        int[] numArray = { 1,2,3,4,5,6,7,8,9,10 };
        int expResult = 1;
        int result = ArrayHigherNumbersProblem11.getLowest(numArray);
        assertEquals(expResult, result);
        
    }
    
}
