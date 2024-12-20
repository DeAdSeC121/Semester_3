import java.util.Scanner;
public class Ass_Wrapper_Q9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Read an integer as a string and convert it to Integer
		System.out.print("Enter an integer: ");
		String intString = scanner.nextLine();
		Integer intValue = Integer.valueOf(intString);
		System.out.println("Converted Integer: " + intValue);

		// Read a float as a string and convert it to Float
		System.out.print("Enter a float: ");
		String floatString = scanner.nextLine();
		Float floatValue = Float.valueOf(floatString);
		System.out.println("Converted Float: " + floatValue);

// Read a double as a string and convert it to Double
System.out.print("Enter a double: ");
String doubleString = scanner.nextLine();
Double doubleValue = Double.valueOf(doubleString);
System.out.println("Converted Double: " + doubleValue);

// Read a boolean as a string and convert it to Boolean
System.out.print("Enter a boolean (true/false): ");
String booleanString = scanner.nextLine();
Boolean booleanValue = Boolean.valueOf(booleanString);
System.out.println("Converted Boolean: " + booleanValue);

// Close the scanner
scanner.close();
	}
}
