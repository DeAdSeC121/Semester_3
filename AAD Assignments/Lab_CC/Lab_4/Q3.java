/* Given an array of integers, write a JAVA program to find, if reversing a sub-array makes 
the array sorted. */

package Lab_4;

import java.util.Arrays;

public class Q3{
    public static void main(String[] args) {
        int a[]={2,4,10,7,6,10,25,41,45};
        System.out.println("og array= "+Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                reverse(a,i,j);
                while(isSorted(a)){
                    System.out.print("subarray to be reversed= [ ");
                    for(int k=i;k<=j;k++){
                        System.out.print(a[k]);
                        if(k<j)
                            System.out.print(" , ");
                    }
                    System.out.print(" ] ");
                    return;}
                    reverse(a,i,j);
                }
            }
        System.out.println("no subarray found");
        }

    public static boolean isSorted(int []a) {
        for(int i=0;i<a.length-1;i++){
            if (a[i]>a[i+1])
                    return false;

        }
        return true;

    }

    public static void reverse(int a[], int s, int e){
        while(s<e)
        {
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    }