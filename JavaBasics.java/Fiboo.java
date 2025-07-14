import java.util.Scanner;
public class Fiboo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= n){
            int temp = a + b;
            a = b;
            b = temp;
            System.out.println( b);
            count++;
        }
        sc.close();
}
}
