// Write a JAVA program to generate the nth Fibonacci number. 

package Lab_2;

public class Q4 {

	public class ass_2_03 {
	    public static int fibo(int n)
	    {
	    	if(n==0) 
	    	{
	    		return 0;
	    	}
	    	else if(n==1||n==2)
	    	{
	    		return 1;
	    	}
	    	else
	    		return fibo(n-1)+fibo(n-2);
	    }
	       
	   public static void main (String[]args)
	   {
		   System.out.println(fibo(1));
		   
	   }
	}
}



