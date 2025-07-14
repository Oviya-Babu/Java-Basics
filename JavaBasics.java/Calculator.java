import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = sc.nextInt();
        System.out.print("Enter num2:");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator(+,-,%, /,*): ");
        char operator = sc.next().charAt(0);
        if(operator == '+'){
            int sum = num1 + num2;
            System.out.println("The sum is : " + sum);
        }
        else if(operator == '-'){
            int sub = num1 - num2;
            System.out.println("The diff is : " + sub);
        }
        else if(operator == '/'){
            if(num2 != 0){
                int div = num1 / num2;
                System.out.println("The division is : " + div);
            }else{
                 System.out.println("Cannot divide by zero!");
            }
        }
        else{
            System.out.println("Invalid Operator!!");
        }
        

        
        sc.close();
        
    }
    
}
