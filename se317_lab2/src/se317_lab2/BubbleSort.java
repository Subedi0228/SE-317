package se317_lab2;
import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
	
	// Final values for size range of the array and its values
	private static final int MIN_SIZE = 7;
	private static final int RANGE_SIZE = 14;
	private static final int MAX_RANDOM_VALUE = 50;
	
    public static void main(String[] args) {
    	
    	Random random = new Random();
    	int size = random.nextInt(RANGE_SIZE) + MIN_SIZE;
        int[] unsortedArray = new int[size];
        
        // Randomly generating the values for the array
        for(int i = 0; i < unsortedArray.length; i++) {
        	unsortedArray[i] = random.nextInt(MAX_RANDOM_VALUE);
        }
        
        // Printing the old and the new arrays:
        System.out.println("Old Array: " + Arrays.toString(unsortedArray));
        bubbleSort(unsortedArray);
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }
    
    /**
     * Sorts an array of integers using the bubble sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * Sorts an array of integers using a faulty bubble sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void faultyBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Introduce the fault by always swapping elements
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    
    /**
     * Sorts an array of integers using the corrected bubble sort algorithm.
     * @param arr The array to be sorted.
     */
    public static void correctedBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                	// Fixed the fault by only swapping elements when arr[j] > arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}