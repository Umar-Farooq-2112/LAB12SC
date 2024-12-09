package test;

import org.junit.jupiter.api.Test;

import Tasks.SumOfDigits;

import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest {
    @Test
    void testZero() {
    	int res = SumOfDigits.sumOfDigits(0);    	
    	assertEquals(res,0);
    }
    @Test
    void testSingleDigits() {
    	int res1 = SumOfDigits.sumOfDigits(4);    	
    	int res2 = SumOfDigits.sumOfDigits(8);    	
    	int res3 = SumOfDigits.sumOfDigits(0);    	
    	int res4 = SumOfDigits.sumOfDigits(-4);    	
    	assertEquals(res1,4);
    	assertEquals(res2,8);
    	assertEquals(res3,0);
    	assertEquals(res4,4);
    }
    @Test
    void testMultipleDigits() {
    	int res1 = SumOfDigits.sumOfDigits(17465);    
    	int res2 = SumOfDigits.sumOfDigits(54);    	
    	int res3 = SumOfDigits.sumOfDigits(4598);    	

    	assertEquals(res1,23);    	
    	assertEquals(res2,9);
    	assertEquals(res3,26);
    }
    
    @Test
    void testNegatives()  {
    	int res1 = SumOfDigits.sumOfDigits(-17465);   
    	int res2 = SumOfDigits.sumOfDigits(-65);   
    	int res3 = SumOfDigits.sumOfDigits(-0);   

    	assertEquals(res1,23);    	
    	assertEquals(res2,11);
    	assertEquals(res3,0);

    }
}

