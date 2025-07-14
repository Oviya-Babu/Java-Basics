import java.util.Scanner;

public class Swap {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
   // int SwappedNum = SwapNum(a,b);
    SwapNum(a,b);
    sc.close();

   }
   
   public static void SwapNum(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.println(a + " " + b);

   }
}
