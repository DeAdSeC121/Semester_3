/*Given an array of positive numbers, a reduction operation involves subtracting the smallest 
number of the array from each element of the array. Write a JAVA program to perform 
reduction till no elements left in the array. Print the elements left after each reduction and 
total number of reductions performed.*/


package Lab_4;

public class Q1_1{
    public static boolean allZeros(int arr[] ){
        for(int i:arr)
            if(i!=0)
             return false ;
        return true;
    }

    public static int smallest(int arr[] ) {
        if(arr==null || arr.length==0)
            return -1;
        else
        {
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0 && arr[i]<min)
                    min=arr[i];
            }
            return min;
        }

    }

    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6,2,4,3};
        int c=0;

        while(!allZeros(arr)){
            int min=smallest(arr);
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=0)
                    arr[i]-=min;
            }
            c++;


            System.out.println("The smallest element is: "+c);
            for (int i=0;i< arr.length;i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println(" ");
           
        }


    }
}