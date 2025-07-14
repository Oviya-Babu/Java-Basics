public class OrderAgnosticBS {
    public static void main(String[] args) {
       int[] arr = {-33, -31, -12, -5, -3,12,32 ,34, 56, 78,89, 99};
       // int[] arr = {99,98,87, 76, 65, 54,43,32,21,11, 2, -3, -15};
        int target = 89;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    public static int orderAgnosticBS(int[] arr , int target){
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
          }
          else {
            if( target > arr[mid]){
                end = mid -1;
            }
            else{
                start = mid + 1;
            }

          }
        }
        return -1;
    }
    
}
