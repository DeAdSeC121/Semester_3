/*Write a JAVA program to arrange n numbers present in a given array in ascending order using Insertion sort algorithm. 
using Insertion sort algorithm. */

package Lab_3;

public class Q2 {
    //insertion sort
    public static void main(String[] args) {
        int arr[] ={-1,-4,2,1,3,9,1,3,3};
        for(int j=0;j<arr.length;j++)
        {
            int key =arr[j];
            int i=j-1;
            while(i>=0 && arr[i]>key)
            {

                    arr[i + 1] = arr[i];
                    i=i-1;

            }
            arr[i+1]=key;

        }
        System.out.println("Sorted array in ascending order:");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
