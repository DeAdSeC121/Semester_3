

	import java.util.*;
	public class q01 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub=
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a & b: ");
				int x=sc.nextInt();
				int y=sc.nextInt();
				
			int temp=x;
			x=y;
			y=temp;
			
			System.out.println("After sawp a= "+x+" & b= "+y);

		}

	}