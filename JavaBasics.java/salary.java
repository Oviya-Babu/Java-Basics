import java.util.Scanner;
public class salary {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Salary:");
    int Salary = sc.nextInt();
    if( Salary > 10000){
        Salary += 2000;

    }
    else{
        Salary += 1000;
    }

    System.out.print("Bonus Salary" + Salary);
    sc.close();

  }
}
