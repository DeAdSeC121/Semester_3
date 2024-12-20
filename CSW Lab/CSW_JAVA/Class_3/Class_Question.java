
public class Class_Question {
	

	    public static void add(int x, int y) {
	        while (y != 0) {
	            // Calculate carry
	            int carry = x & y;

	            // Calculate sum without carry
	            x = x ^ y;

	            // Shift carry to the left
	            y = carry << 1;
	        }
	        System.out.println(x);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 2; // Example number 1
        int y = 3; // Example number 2
        Class_Question ob =new Class_Question ();
        add(x,y);

        

	}
	}

