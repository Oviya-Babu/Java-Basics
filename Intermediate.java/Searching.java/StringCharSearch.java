public class StringCharSearch {
 public static void main(String[] args) {
    String name = "Oviya";
    char letter = 'P';
    System.out.print(String.valueOf(Search(name,letter)));
    
}
public static boolean Search(String name, char c){
    if(name.length() == 0){
        return false;

    }
    for(int i = 0; i < name.length(); i++){
        if( c == name.charAt(i)){
            return true;
        }
    }
    return false;
}
}