import java.util.Scanner;
public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            int a = 0;
            int b = 1;
            int count = 2;

            while (count < n) {
                int temp = a + b;
                a = b;
                b = temp;
                count++;
            }
            System.out.println(b);
        }
        sc.close();
    }
}
