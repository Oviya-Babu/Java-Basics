import java.util.Scanner;
public class HcfLcm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int a = sc.nextInt();
        System.out.print("Enter num2:");
        int b = sc.nextInt();
         
        int num1 = a;
        int num2 = b;
        
        while(b != 0 ){
            int rem = a % b ;
            a = b;
            b = rem;

        }
        int Hcf = a;
        int Lcm = (num1 * num2 )/Hcf;
        
        System.out.println(" The Hcf of " + num1 + "and " + num2 + "is " + Hcf);
        System.out.println(" The Lcm of " + num1 + "and " + num2 + "is " + Lcm);


        
        
        sc.close();
        
    }
    
}
