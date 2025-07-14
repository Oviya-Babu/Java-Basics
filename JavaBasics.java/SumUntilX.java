import java.util.Scanner;
public class SumUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int sum = 0;
       while(true){
          System.out.print("Enter a number (or 'x' to exit): ");
          String n = sc.next();
          if(n.equals("x")){
            System.out.println("The loop ends..!");
            break;
          }
          else{
            try{
                int num = Integer.parseInt(n);
            // You can now use 'num' as an integer
                sum += num;
      
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input!!");

            }


          }  

          }
          System.out.println("The final sum is:  " + sum);
          sc.close();
       

       }    
    }



