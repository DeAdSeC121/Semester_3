/*Give an array ,check if a given value is present in the array using Iterative Linear Search algo.
  Display the position of the value if found  ,and NOT PRESENT if not*/

package Lab_5;
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. to be searched in the array: ");
		int x=sc.nextInt();
		
		int arr[]= {1,5,6,85,3,26,32};
		int c=0,k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				c++;
				k=i;
				break;
			}
			
		}
		if(c==0)
		{
			System.out.println("Not PRESENT");
		}
		else 
			System.out.println("PRESENT at: "+k);
	}

}
