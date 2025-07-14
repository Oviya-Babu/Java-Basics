import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter name: ");
        String Name = sc.nextLine();
        String display = greeting((Name));
        System.out.println(display);  
        sc.close();
    }
    public static String greeting(String name){
        String message = "Hello " + name;
        return message;

    }
    
}
