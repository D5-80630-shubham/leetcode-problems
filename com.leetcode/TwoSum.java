import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        
        int[] arr = {0,4,3,0};
        System.out.println(Arrays.toString(twoSum(arr, 0)));
    }
    public static int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            // sum = nums[i];
            for(int j=i+1;j<nums.length;j++){
                sum =nums[i]+ nums[j];
                
                if(sum == target){
                    return new int[] {i,j};
                    
                }
                // if(sum> target) break;
            }
        }

        return new int[] {};
    }
}
