
import java.util.Scanner;

public class FourFunctionCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + ((double) num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        // Integer division with negative operands truncates toward zero,
        // which can differ from mathematical floor division.
        input.close();
    }
}
