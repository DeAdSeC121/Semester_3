/*Given an array of positive numbers, a reduction operation involves subtracting the smallest 
number of the array from each element of the array. Write a JAVA program to perform 
reduction till no elements left in the array. Print the elements left after each reduction and 
total number of reductions performed.*/

package Lab_4;

public class Q1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,5,658,6,2,33,45};
		
		int c=0;
		while(c!=arr.length-1)	
		{
			
		
		//to find the smallest element in the array
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0 && arr[i]<min)//to nt count 0 as min element
			{
				min=arr[i];
			}
		}
		
		//To remove that element from the array
		
		int x=min;//to store the min element in a variable
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				arr[i]=0;
			}
		}
		
		
		//to minus min element from all elements in the array
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]-min<0)//to nt let go this operation in -ve values
			{
				arr[i]=0;
			}
			else//if nt going to be -ve the do the minus operation
			arr[i]=arr[i]-min;
		}
		
		//to print the array
		System.out.println("The smallest element is: "+min);
		for(int j=0;j<arr.length;j++)
		{	
			System.out.print(arr[j]);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		//To check if their is any element present more than 0 or not
	
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]==0)
			{
				c++;
			}
		}
		
		

		
		}
		
	
	}

}
