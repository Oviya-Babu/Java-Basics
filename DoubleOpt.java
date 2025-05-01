import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for three double values
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the third number (c): ");
        double c = scanner.nextDouble();

        // Performing floating-point operations
        double result1 = a + b * c;  // Multiplication (*) first, then addition (+)
        double result2 = a * b + c;  // Multiplication (*) first, then addition (+)
        double result3 = c + a / b;  // Division (/) first, then addition (+)
        double result4 = a % b + c;  // Modulus (%) first, then addition (+)

        // Displaying the results
        System.out.println("The result of a + b * c is: " + result1);
        System.out.println("The result of a * b + c is: " + result2);
        System.out.println("The result of c + a / b is: " + result3);
        System.out.println("The result of a % b + c is: " + result4);

        scanner.close();
    }
}
