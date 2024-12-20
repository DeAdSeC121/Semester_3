
public class Ass_BitWisw_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=12;
		int c=0;
		
		while(x>=0)
		{
			int bit=x&1;
			x=x>>>1;
			if(bit==1)
			{
				c++;
			}
		}
		System.out.println(c);
		

	}

}
