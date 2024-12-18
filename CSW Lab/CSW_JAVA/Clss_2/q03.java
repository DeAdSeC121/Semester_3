

	import java.util.*;
	public class q03 {
		
		
		public static void Swapf(int x,int y)
		{
			int temp=x;
			x=y;
			y=temp;
			System.out.println("After sawp a= "+x+" & b= "+y);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a & b: ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			
			q03 s1 =new q03();
			Swapf(x,y);

		}

	}