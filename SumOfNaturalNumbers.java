import java.util.Scanner;
public class SumOfNaturalNumbers {
 public static void main ( String [] args) {
 Scanner input = new Scanner (System.in);
 System.out.println( " Enter a Number : ");
 int n = input.nextInt();
 if (n>=0) {
  int sum = n* (n+1) /2 ;
  System.out.println( " The sum of " + n + " Natural numbers is " + sum );
}else {
   System.out.println( " The number is " + n + " is not a natural number " );
}
  input.close();
}
}
  
 
