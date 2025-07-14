import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {4,6,7,8,9,},
            {10,11,12},
            {13,14},

        };
        int target = 11;
        int[] ans = search2d (arr, target);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] search2d(int[][] nums, int target){
        if(nums.length ==0){
            return new int[]{-1, -1};
        }
        for(int i = 0; i < nums.length; i++){
          for(int j = 0; j < nums[i].length; j++)  {
            if(nums[i][j] == target ){
                return new int[]{i, j};
            }
          }
        }  
        return new int[]{-1, -1};
    }

    }
	

