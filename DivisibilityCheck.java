import java.util.Scanner;
public class DivisibilityCheck {
 public static void main( String [] args){
  Scanner input = new Scanner( System.in);
  System.out.println( "Enter Number : ");
  int num = input.nextInt();
  if (num%5==0){
   System.out.println(" Is the number "  + num + " divisible by 5 ? YES " );
  }else { 
   System.out.println ( " Is the number "  + num + " divisible by 5 ? NO " );
   input.close();
   }
 } 
} 
