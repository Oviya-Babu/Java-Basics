
import java.util.Scanner;
public class SmallestNumber {
 public static void main ( String [] args) {
 Scanner input = new Scanner( System.in);
 System.out.println (" Enter Number 1 : " );
 int num1 = input.nextInt();
 System.out.println (" Enter Number 2 : " );
 int num2 = input.nextInt();
 System.out.println (" Enter Number 3 : " );
 int num3 = input.nextInt();
 if (( num1< num2) && ( num1< num3)) {
  System.out.println(" Is the first number the smallest ? Yes " );
 }else {
  System.out.println( "Is the first number the smallest ? No " );
 }
 }
} 
 
