


	import java.util.*;
	public class q05a {
		
		public static void rev(int x)
		{
			int d;
			int r=0;
			while(x!=0)
			{
				d=x%10;
				x=x/10;
				r=r*10+d;
				
				System.out.println("The revirse of the number is: "+r);
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number ");
			int x=sc.nextInt();
			
			


		}

	}
