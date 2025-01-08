/*Give an array ,check if a given value is present in the array using Recursive Binary Search algo.
  Display the position of the value if found  ,and NOT PRESENT if not*/

package Lab_5;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number to be searched in the array: ");
	        int x = sc.nextInt();
	        
	        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	        
	        // Call the recursive binary search method
	        int result = binarySearch(arr, x, 0, arr.length - 1);
	        
	        if (result == -1) {
	            System.out.println("NOT PRESENT");
	        } else {
	            System.out.println("Element present at index " + result);
	        }
	    }

	    // Recursive binary search method
	    public static int binarySearch(int[] arr, int x, int start, int end) {
	        if (start > end) {
	            return -1; // Base case: element not found
	        }

	        int mid = start + (end - start) / 2; // Calculate mid index

	        if (arr[mid] == x) {
	            return mid; // Element found
	        } else if (arr[mid] > x) {
	            return binarySearch(arr, x, start, mid - 1); // Search in the left half
	        } else {
	            return binarySearch(arr, x, mid + 1, end); // Search in the right half
	        }

	}

}
