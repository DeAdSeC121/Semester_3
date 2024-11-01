//Given any array of integers, check if a given value is present in the array using iterative linear search algorithem. Display the position of the value if found,and "NOT PRESENT" if not.

import java.util.*;
public class Q1
{
     public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element to be searched:");
        n=sc.nextInt();
        int arr[]={1,2,3,4,5,6,7};
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
            System.out.println("Searched element is fount at potion: "+(i+1));
            break;
            }

        }

     }
}
