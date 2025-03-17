
import java.util.Scanner;
public class NumberCheck {
 public static void main ( String [] args ){
 Scanner input = new Scanner ( System.in );
 System.out.println (" Enter A Number : " );
 int number = input.nextInt();
 if( number>0 ){
  System.out.println( " Positive " );
 }else if ( number==0 ) {
  System.out.println( " Zero ");
 }else {
  System.out.println( " Negative ");
}
 input.close();
}
} 
