import java.util.Scanner;
public class Palindromee {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String Word = input.nextLine();
        String ReverseWord = "";
         String cleaned = Word.replaceAll("\\s+", "").toLowerCase();
        int i = cleaned.length() -1;
        while(i >= 0){
            char RevWord  = cleaned.charAt(i);
            ReverseWord += RevWord;
            i--;

        }    
            if(ReverseWord.equals(cleaned)){
                System.out.println("Palindrome");

            }
            else{
                System.out.println("Not a Palindrome");
            }
            input.close();
    }
}
