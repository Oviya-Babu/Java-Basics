//import java.util.Scanner;
public class Ceiling {
    public static void main(String[] args) {
       int[] arr = {2, 3, 5, 9, 14, 16, 18};
       // int[] arr = {99,98,87, 76, 65, 54,43,32,21,11, 2, -3, -15};
        int target = 15;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int size = sc.nextInt();
        // System.out.println("Enter the elements of the array: ");
        // int[] arr = new int[size];
        // for(int i = 0; i < arr.length; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Enter the target: ");
        // int target = sc.nextInt();
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
       // sc.close();
    }
    // return the index of the smallest number >= target
    public static int orderAgnosticBS(int[] arr , int target){
       //But what if the target is greatest of the greater number in the array?
       if(target > arr.length -1){
        return -1;
       }

        int start = 0;
        int end = arr.length - 1;

       // to check whether the array is ascending or not
       boolean isAsc = arr[start] < arr[end];
       while( start <= end){
          int mid = start + (end - start)/2;
          
          if(arr[mid] == target){
            return mid;
          }
          
          if(isAsc){
            if(target > arr[mid]){
                start = mid + 1;
            }
                else{
                    end = mid - 1;
                }
            } else {
                if( target > arr[mid]){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return start;

    }
}
