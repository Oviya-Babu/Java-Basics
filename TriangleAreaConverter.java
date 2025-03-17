import java.util.Scanner;
public class TriangleAreaConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter base of the triangle (in cm): ");
        double base = scanner.nextDouble();
        System.out.print("Enter height of the triangle (in cm): ");
        double height = scanner.nextDouble();
        double areaCm = 0.5 * base * height;
        // Convert to square inches (1 cm² = 0.155 square inches)
        double areaInches = areaCm * 0.155;
        // Convert height to feet and inches
        double heightInInches = height / 2.54;
        double heightInFeet = heightInInches / 12;
        System.out.println("\nThe area of the triangle:");
        System.out.println("In square centimeters: " + areaCm + " cm²");
        System.out.println("In square inches: " + areaInches + " in²");
        System.out.println("\nYour Height:");
        System.out.println("In centimeters: " + height + " cm");
        System.out.println("In feet: " + heightInFeet + " ft");
        System.out.println("In inches: " + heightInInches + " in");
        scanner.close();
    }
}
