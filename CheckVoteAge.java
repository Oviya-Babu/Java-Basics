import java.util.Scanner;
public class CheckVoteAge {
 public static void main ( String [] args) {
 Scanner input = new Scanner (System.in);
 System.out.println( " Enter Age : ");
 int Age = input.nextInt();
 if (Age>=18) {
   System.out.println( " The Person's Age is " + Age + " and can vote "  );
}else {
   System.out.println(" The Person's Age is " + Age + " and cannot vote "  );
}
  input.close();
}
}
  
 