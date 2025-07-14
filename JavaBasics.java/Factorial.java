import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int factorial = fact(num);
        System.out.println(factorial);
        sc.close();
      

    }
    public static int fact(int a){
      
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;



    }

  
    
    
}
