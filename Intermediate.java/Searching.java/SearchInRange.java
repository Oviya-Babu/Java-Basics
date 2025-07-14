//package Advanced.java;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {1, 2, 33 , 44, 17, 7 , 34, 90};
        int target = 17;
        System.out.println(SearchRange(nums, target, 3, 5));
        
    }
    public static int SearchRange(int[] arr, int target, int start , int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i =  0; i < arr.length; i++){
            if( target == arr[i]){
                return i;
            }
        }
        return -1;
    }
}
