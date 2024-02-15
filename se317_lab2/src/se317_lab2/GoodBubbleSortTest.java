package se317_lab2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GoodBubbleSortTest {

	/**
	 * Part A: The two tests below test the bubbleSort that works properly.
	 */
    // Test for sorting an already sorted array
    @Test
    void testBubbleSortWithSortedArray() {
        // Arrange: Create a sorted array and its expected result
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        
        // Act: Sort the array
        BubbleSort.bubbleSort(sortedArray);
        
        // Assert: Check if the array remains sorted
        Assertions.assertArrayEquals(expectedArray, sortedArray, "Array should remain sorted after sorting.");
    }
    
    // Test for sorting a reverse sorted array
    @Test
    void testBubbleSortWithReverseSortedArray() {
        int[] reverseSortedArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};

        BubbleSort.bubbleSort(reverseSortedArray);
        Assertions.assertArrayEquals(expectedArray, reverseSortedArray, "Array should be sorted after sorting.");
    }
    
    
	/**
	 * Part B: The two tests below test but do not reveal the fault in the faulty bubbleSort
	 */
    // Test for sorting an array with all the same elements (this test will pass even with a faulty sorting algorithm)
    @Test
    void testFaultyBubbleSortWithIdenticalElements() {
        int[] sortedArray = {1, 1, 1, 1};
        int[] expectedArray = {1, 1, 1, 1};

        BubbleSort.faultyBubbleSort(sortedArray);
        Assertions.assertArrayEquals(expectedArray, sortedArray, "Array should remain sorted after sorting.");
    }
    
    // Test for sorting a reverse sorted array (this test will pass even with a faulty sorting algorithm)
    @Test
    void testFaultyBubbleSortWithReverseSortedArray() {
        int[] reverseSortedArray = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        
        BubbleSort.faultyBubbleSort(reverseSortedArray);
        Assertions.assertArrayEquals(expectedArray, reverseSortedArray, "Array should be sorted after sorting.");
    }
    
    
	/**
	 * Part C: The two tests below test and reveal the fault in the faulty bubbleSort
	 */
    // Test for sorting a random array
    @Test
    void testFaultyBubbleSortWithRandomArray() {
        int[] randomArray = {5, 2, 4, 1, 3};
        int[] expectedArray = {1, 2, 3, 4, 5};
        
        BubbleSort.faultyBubbleSort(randomArray);
        Assertions.assertArrayEquals(expectedArray, randomArray, "Array should be sorted after sorting.");
    }
    
    // Test for sorting a large ascending array
    @Test
    void testFaultyBubbleSortWithLargeArray() {
        int[] largeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        BubbleSort.faultyBubbleSort(largeArray);
        Assertions.assertArrayEquals(expectedArray, largeArray, "Array should be sorted after sorting.");
    }
    
    
	/**
	 * Part D: The two tests below are the same as part C, but on the corrected bubbleSort
	 * therefore, they will pass because the method works properly.
	 */
    // Test for sorting a random array
    @Test
    void testCorrectedBubbleSortWithRandomArray() {
        int[] randomArray = {5, 2, 4, 1, 3};
        int[] expectedArray = {1, 2, 3, 4, 5};
        
        BubbleSort.correctedBubbleSort(randomArray);
        Assertions.assertArrayEquals(expectedArray, randomArray, "Array should be sorted after sorting.");
    }
    
    // Test for sorting a large ascending array
    @Test
    void testCorrectedBubbleSortWithLargeArray() {
        int[] largeArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        BubbleSort.correctedBubbleSort(largeArray);        
        Assertions.assertArrayEquals(expectedArray, largeArray, "Array should be sorted after sorting.");
    }
}
