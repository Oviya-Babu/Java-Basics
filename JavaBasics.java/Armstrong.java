import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        int original = num;
        int temp = num;

        int count = 0;
        while ( num > 0){
            num /= 10;
            count ++;

        }
        int sum = 0;
        while( temp != 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit,count);
            temp = temp / 10;
        }
       
        
        if(sum == original){
            System.out.println("Armstrong");

        }
        else{
            System.out.println("Not Armstrong");
        }
        sc.close();
        }
    }
    

