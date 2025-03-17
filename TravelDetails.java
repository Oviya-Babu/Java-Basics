import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your starting city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        int fromToVia = scanner.nextInt();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        int viaToFinalCity = scanner.nextInt();
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();
        System.out.print("Enter the total travel fee: ");
        double fee = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();
        int totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        double discountedFee = fee - (fee * discountPercent / 100);
        System.out.println("\n===== Travel Details =====");
        System.out.println("Traveler: " + name);
        System.out.println("Route: " + fromCity + " → " + viaCity + " → " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");
        System.out.println("Final Fee after " + discountPercent + "% discount: $" + discountedFee);
        System.out.println("\nThe results of Int Operations are: " + totalDistance + ", " + (totalDistance / 2) + ", and " + (totalDistance % 2));
        scanner.close();
    }
}
