/*Give an array ,check if a given value is present in the array using Iterative Binary Search algo.
  Display the position of the value if found  ,and NOT PRESENT if not*/

package Lab_5;
import java.util.*;

public class Q3 {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the number to be searched
        System.out.println("Enter the number to be searched in the array: ");
        int x = sc.nextInt();
        
        // Define a sorted array of integers
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        // Call the iterative binary search method
        int result = iterativeBinarySearch(arr, x);
        
        // Check the result and display the appropriate message
        if (result == -1) {
            System.out.println("NOT PRESENT");
        } else {
            System.out.println("Element present at index " + result);
        }
    }

    // Iterative binary search method
    public static int iterativeBinarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Calculate the mid index
            int mid = start + (end - start) / 2;

            // Check if the middle element is the target value
            if (arr[mid] == x) {
                return mid; // Element found, return its index
            } 
            // If the target value is smaller than the middle element, search in the left half
            else if (arr[mid] > x) {
                end = mid - 1;
            } 
            // If the target value is larger than the middle element, search in the right half
            else {
                start = mid + 1;
            }
        }

        return -1; // Element not found
    }
}