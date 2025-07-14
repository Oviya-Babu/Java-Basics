import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double PI = 3.14;
        //double num2 = sc.nextDouble();
        double area = PI * num1 * num1;
        System.out.println(area);
        sc.close();


    }
}
