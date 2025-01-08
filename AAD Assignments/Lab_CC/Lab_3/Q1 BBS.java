/*write a JAVA program to arrange n numbers present in a given array in ascending order 
using Bubble sort algorithm. */

package Lab_3;
import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        int arr[] = {2, 8, 89, 6, 7, 3, 74};

        // Bubble sort implementation
        for (int i = 0; i < arr.length-1; i++) //for no of passes
        { // Corrected loop condition
            for (int j = 0; j < arr.length-1- i; j++) 
            { // Corrected loop condition
                if (arr[j] > arr[j + 1]) 
                { 
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j]; 
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}