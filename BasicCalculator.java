import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float number2 = scanner.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = (number2 != 0) ? (number1 / number2) : Float.POSITIVE_INFINITY;
        System.out.println("The addition, subtraction, multiplication, and division of numbers " + number1 + " and " + number2 + " are: ");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);      
        if (number2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Undefined (cannot divide by zero)");
        }
        scanner.close();
    }
}
