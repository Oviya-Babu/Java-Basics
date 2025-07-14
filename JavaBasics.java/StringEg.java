import java.util.Scanner;
public class StringEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println(name + greeting());
        sc.close();

    }

    static String greeting(){
        String greeting = " How are you?";
       // System.out.println(greeting);
        return greeting;

    }
}