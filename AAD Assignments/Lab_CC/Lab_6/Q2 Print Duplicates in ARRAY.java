//Write a java program to print the duplicate elements in a given array of N elements.

package Lab_6;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,1,8,35,9,6,8,9};
		boolean DP= false;
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					DP=true;
					break;
				}
				
				
			}
		}
		if(DP!=true)
		System.out.println("Elemenet not found");

	}

}
