import java.util.Scanner;
public class OddOrEven{
 public static void main(String[]args){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter a number : ");
  int number =input.nextInt();
  if(number<1){
    System.out.println(" Please enter a valid natural number.");
   }else{
	 for(int i=1;i<=number;i++){
       if(i%2==0){		 
         System.out.println(i + " is an even number. ");
       }
	   else{
		   System.out.println(i + " is an odd number .");
  }
  }
}   
input.close();
 }
} 