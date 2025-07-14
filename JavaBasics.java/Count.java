import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int Result = reverse(num);
        System.out.print("The count of the number is : " +  Result);
        sc.close(); 
    }
    // 1534236469
     public static int reverse(int x) {
        int rev = 0;
        if(rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE /10){
            return 0;
        }
        while( x > 0 || x <  0){
            int rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev;

    }
}

