import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for three integers
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number (c): ");
        int c = scanner.nextInt();

        // Performing integer operations
        int result1 = a + b * c;  // Multiplication (*) has higher precedence than addition (+)
        int result2 = a * b + c;  // Multiplication (*) first, then addition (+)
        int result3 = c + a / b;  // Division (/) first, then addition (+)
        int result4 = a % b + c;  // Modulus (%) first, then addition (+)

        // Displaying the results
        System.out.println("The result of a + b * c is: " + result1);
        System.out.println("The result of a * b + c is: " + result2);
        System.out.println("The result of c + a / b is: " + result3);
        System.out.println("The result of a % b + c is: " + result4);

        scanner.close();
    }
}
