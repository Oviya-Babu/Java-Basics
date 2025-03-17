import java.util.Scanner;
public class CountDown {
 public static void main (String[] args){
  Scanner input = new Scanner( System.in);
  System.out.println (" Enter a Number : " );
  int counter = input.nextInt();
  while( counter>=1 ){
   System.out.println ( " The value of Counter : " + counter);
   counter--;
  }
  input.close();
 }
} 
 