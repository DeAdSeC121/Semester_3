/*Give an array ,check if a given value is present in the array using Recursive Linear Search algo.
  Display the position of the value if found  ,and NOT PRESENT if not*/

package Lab_5;
import java.util.*;
public class Q2 {
	
	 public static int LS(int arr[], int size, int x) {
	        if (size == 0) {
	            return -1; // Base case: element not found
	        } else if (arr[size - 1] == x) { // Check the last valid element
	            return size - 1; // Return the index of the found element
	        }
	        return LS(arr, size - 1, x); // Recursive call
	    }

	    public static void main(String[] args) {
	        // Input
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number to be searched in the array: ");
	        int x = sc.nextInt();

	        // Array to search in
	        int arr[] = {1, 5, 6, 8, 4, 3, 98};

	        // Perform recursive linear search
	        int result = LS(arr, arr.length, x);

	        // Output result
	        if (result != -1) {
	            System.out.println("Element present at index " + result);
	        } else {
	            System.out.println("Element not present");
	        }
	        
	        sc.close(); // Close the scanner

		

	}

}
