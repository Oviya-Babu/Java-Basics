import java.util.Scanner;
public class primeOrNot {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if( num == 0 && num % 2 != 0){
            System.out.println("The number " + num + " is Prime " );
        }
        else{
            System.out.println("The number " + num + " is not PRIME");
        }
        sc.close();
    }
    public static boolean isPrime(int n){
       for(int i = 2; i < n; i++){
         if( n % i == 0){
            return false;
         }
    
       }
       return n > 1;
    }
    
}
