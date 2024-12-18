
import java.util.*;
public class q06 {
	
	public static void GraRe(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+" is the greatest among "+x+" "+y+" "+z);
			}
			else
				System.out.println(z+" is the greatest among "+x+" "+y+" "+z);
		}
		else
		{
			if(y>z)
				System.out.println(y+" is the greatest among "+x+" "+y+" "+z);
		
		
		else
			System.out.println(z+" is the greatest among "+x+" "+y+" "+z);
		}
	}
	
	public static void GraTer(int x,int y,int z)
	{
	
	int Max = (x>y)?(x>z)?x:z:(y>z)?y:z;
	System.out.println(Max+" is the greatest among "+x+" "+y+" "+z);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		GraRe(x,y,z);
		GraTer(x,y,z);

	}

}
