package Lab_2;

public class Practyice {
	
	public static int fact(int x)
	{
		if(x==0)
		{
			return 0;
		}
		else if (x==1)
		{
			return 1;
		}
		else 
			return x*fact(x-1);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(3));
		
	

		
}
}
