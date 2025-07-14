//import java.util.Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = { 3,4,5,1,2};
        boolean result  = IsSorted(arr);
        System.out.println(result);
    }
    public static boolean IsSorted(int arr[]){
      int count = 0;
      for( int i = 0; i < arr.length - 1; i++) {
        if( arr[i] > arr[i+1]){
            if( count >= 1){
            return true;
        }
    }
      }
      return false;
        
    }
}
