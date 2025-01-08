//Write a JAVA program to find the sum of n numbers present in an array. 

package Lab_2;

public class Q1 {
	
	public static int sum(int n,int [] arr)
    {
        if(n==0)
        {
            return arr[0];
        }
        else
            return arr[n]+sum(n-1,arr);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int arr[] = {1,2,3};
        System.out.println(sum(arr.length-1,arr));
        
    }
    }

