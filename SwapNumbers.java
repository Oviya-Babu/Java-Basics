import java.util.Scanner;
public class SwapNumbers {
 public static void main(String [] args) {
  Scanner scanner = new Scanner (System.in);
  System.out.print (" Enter the number1 to Swap : " );
  int number1 = scanner.nextInt();
  System.out.print (" Enter the number2 to Swap : " );
  int number2 = scanner.nextInt();
  int temp = number1;
  number1 = number2;
  number2 = temp;
  System.out.println("The Swapped numbers are" + number1 + " and  " + number2 );
  scanner.close();
 }
} 
