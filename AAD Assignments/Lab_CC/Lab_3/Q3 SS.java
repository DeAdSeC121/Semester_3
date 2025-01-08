/*Write a JAVA program to arrange n numbers present in a given array in ascending order using 
Selection sort algorithm.*/
package Lab_3;

public class Q3 {
    public static void main(String[] args) {


        //selection sort
        int arr [] = {-2, 3, -2, -22, 9, -33};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <arr[ min])
                    min = j;
            }
            if (min != i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;

        }
        }
        System.out.println("Sorted array in ascending order:");
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }


    }
}