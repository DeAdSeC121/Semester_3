import java.util.*;
public class AssQ16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range of number: ");
		int x=sc.nextInt();
		
	
		for(int j=1;j<=x;j++)
		{
		int c=0;
		for(int i=1;i<=j;i++)
		{
			if(j%i==0)
				c++;
		}
		if(c==2)
			System.out.print(j +" ");
		   

	}
	}

	}


