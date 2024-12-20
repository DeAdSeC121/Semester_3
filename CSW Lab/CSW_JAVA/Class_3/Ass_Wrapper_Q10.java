import java.util.Scanner;
public class Ass_Wrapper_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a calculation (e.g., 123+345): ");
        String input = scanner.nextLine();

        // Call the method to perform the calculation
        calculate(input);

        // Close the scanner
        scanner.close();
    }

    private static void calculate(String input) {
        // Regular expression to match the pattern of the input
        String regex = "(\\d+)([+\\-*/])(\\d+)";
        if (input.matches(regex)) {
            // Split the input into operands and operator
            String[] parts = input.split("(?<=[0-9])(?=[+\\-*/])|(?<=[+\\-*/])(?=[0-9])");
            Integer num1 = Integer.valueOf(parts[0]);
            String operator = parts[1];
            Integer num2 = Integer.valueOf(parts[2]);

            // Perform the calculation based on the operator
            switch (operator) {
                case "+":
                    System.out.println("Sum = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("Difference = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("Mul = " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("Div = " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
            }
        } else {
            System.out.println("Invalid input format. Please use the format: number operator number (e.g., 123+345)");
        }

	}

}
