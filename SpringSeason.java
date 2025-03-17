
import java.util.Scanner;
public class SpringSeason {
 public static void main(String[]args)  {
 Scanner input= new Scanner( System.in) ;
 System.out.println (" ENTER MONTH (1-12): ");
 int month = input.nextInt();
 System.out.println(" ENTER DAYS (1-31): ");
 int day = input.nextInt();
 if( (month==3 && day>=20 )|| ( month==4)|| (month==5)|| (month==6 && day<=20) ){
  System.out.println (" Its a Spring Season " );
} else {
  System.out.println( " Not a Spring season " );
}
 input.close();
}
} 
