import java.util.Scanner;
public class inr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rupees in INR: ");
        double rupees = sc.nextDouble();
        double ans = function(rupees);
        System.out.println(ans);
        sc.close();

        /* 
        double rupees = sc.nextDouble();
        double X = 83.5;
        double Usd = rupees / X;
        System.out.print(Usd);
        sc.close();

        */





    }

    public static double function(double rupee){
        double X = 83.5;
        double Usd = rupee / X;
        return Usd;



    }
}