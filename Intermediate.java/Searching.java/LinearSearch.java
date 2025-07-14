public class LinearSearch {
    public static void main(String[] args) {
        
    
    int[] nums = {23, 54 ,12, 13 ,19,200, 245};
    int target = 19;
    int ans = linearSearch(nums, target);
    System.out.print(ans);
    }  
public static int linearSearch(int[] arr, int target){
    for(int i = 0; i< arr.length; i++){
        if(arr.length == 0){
            return -1;

        }
        int element = arr[i];
        if( element == target){
            return i;
        }
    }
    return -1;

}
}

