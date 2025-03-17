import java.util.Scanner;
public class CounterDownNumber {
 public static void main ( String[] args){
 Scanner input = new Scanner(System.in );
 System.out.println(" Enter a number : ");
 int counter = input.nextInt();
 for (int i = counter; i>=1; i-- ){
  System.out.println(" Counter = " +i );
 }
 input.close();
}
}
 