/*Given an unsorted array with both positive and negative elements, write a JAVA program to 
find the smallest positive number missing from the array.*/

package Lab_2;

public class Q8 {
	
	public static boolean present(int arr[],int x)
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(x==arr[i])
				c++;
		}
		if(c>0)
			return true;
		return false;
	}
	
	public static int smallest(int arr[],int index)
	{
		if (present(arr,index))
		{
			return smallest(arr,index+1);
		}
		else
		{
			return index;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-5,-6,1,2,9,6,};
		System.out.println(smallest(arr,0));

	}

}
