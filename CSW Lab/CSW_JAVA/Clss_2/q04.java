


	import java.util.*;
	public class q04 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number ");
			int x=sc.nextInt();
			
			int d;
			
			while(x!=0)
			{
				d=x%10;
				x=x/10;
				System.out.println("DIgits are :" +d);
			}

		}

	}
