package Lab_7;
import java.util.Scanner;
public class SimpleCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter first number: ");
            double n1 = getValidDoubleInput(scanner);

            System.out.print("Enter second number: ");
            double n2 = getValidDoubleInput(scanner);

            System.out.print("Choose operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result;
            switch (operation) {
                case '+':
                    result = n1 + n2;
                    break;
                case '-':
                    result = n1 - n2;
                    break;
                case '*':
                    result = n1 * n2;
                    break;
                case '/':
                    if (n2 != 0) {
                        result = n1 / n2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please choose +, -, *, or /.");
                    continue;
            }

            System.out.println("Result: " + n1 + " " + operation + " " + n2 + " = " + result);

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            char choice = scanner.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                break;
            }
        }
        scanner.close();
    }

    private static double getValidDoubleInput(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.next());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}
	        