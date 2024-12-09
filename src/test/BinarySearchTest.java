package test;

import org.junit.jupiter.api.Test;

import Tasks.BinarySearch;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void testBinarySearchIntegerFound() {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(2, result);  
    }

    @Test
    void testBinarySearchIntegerNotFound() {
        int[] array = {1, 3, 5, 7, 9, 11};
        int target = 6;
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result);  
    }

    @Test
    void testBinarySearchIntegerEmptyArray() {
        int[] array = {};
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result);  
    }

    @Test
    void testBinarySearchIntegerArrayWithOneElementFound() {
        int[] array = {5};
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(0, result);
    }

    @Test
    void testBinarySearchIntegerArrayWithOneElementNotFound() {
        int[] array = {5};
        int target = 3;
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result); 
    }

    // Test for binary search on string array
    @Test
    void testBinarySearchStringFound() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "cherry";
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(2, result); 
    }

    @Test
    void testBinarySearchStringNotFound() {
        String[] array = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "fig";
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result);  
    }

    @Test
    void testBinarySearchStringEmptyArray() {
        String[] array = {};
        String target = "banana";
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result);  
    }

    @Test
    void testBinarySearchStringArrayWithOneElementFound() {
        String[] array = {"banana"};
        String target = "banana";
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(0, result);
    }

    @Test
    void testBinarySearchStringArrayWithOneElementNotFound() {
        String[] array = {"banana"};
        String target = "apple";
        int result = BinarySearch.binarySearchRecursive(array, target, 0, array.length - 1);
        assertEquals(-1, result);  
    }

    @Test
    void testBinarySearchIntegerNullArray() {
        int[] array = null;
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(array, target, 0, 0);
        assertEquals(-1, result);  
    }

    @Test
    void testBinarySearchStringNullArray() {
        String[] array = null;
        String target = "apple";
        int result = BinarySearch.binarySearchRecursive(array, target, 0, 0);
        assertEquals(-1, result);  
    }

}
