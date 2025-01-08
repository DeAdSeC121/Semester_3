/*Given an array of n-1 unique elements from 1 to n with a number missing. 
 * Write a JAVA program to find the missing number*/

package Lab_6;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] a = {1, 2, 3, 4, 5, 7};
	        int n = a.length + 1;
	        int s = 0;
	        int total = n * (n + 1) / 2;
	        for (int i : a) {
	            s += i;
	        }
	        System.out.println("missing number is= "+(total-s));

	}

}
