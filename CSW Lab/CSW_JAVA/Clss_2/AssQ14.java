import java.util.*;
public class AssQ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x=sc.nextInt();
		
		int c=0;
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				c++;
		}
		if(c==2)
			System.out.println("Prime No.");
		else
			System.out.println("Not Prime No.");

	}

}
