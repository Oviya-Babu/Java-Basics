
import java.util.Scanner;
public class LargestNumber{
 public static void main(String[] args){
 Scanner input = new Scanner ( System.in );
 System.out.println(" Enter Number 1: ") ;
 int num1 = input.nextInt();
 System.out.println(" Enter Number 2: ") ;
 int num2 = input.nextInt();
 System.out.println(" Enter Number 3: ") ;
 int num3 = input.nextInt();
 if ((num1>num2) && (num1>num3)){
  System.out.println( " Is the first number the largest? YES " );
 } else if ((num2>num1) && (num2>num3)){
  System.out.println( " Is the second number the largest? YES " );
 } else {
   System.out.println( " Is the third number the largest? YES " );
   }
   input.close();
  }
}
  
 
