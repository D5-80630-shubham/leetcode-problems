import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {

        int[] arr = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        left[0] = 1;
        int[] right = new int[nums.length];
        right[nums.length-1] = 1;

        
        for(int i=1;i<nums.length;i++){
            left[i] = nums[i-1] * left[i-1];
        }

        for(int i=nums.length-2;i>=0;i--){
            right[i] = nums[i+1] * right[i+1];
        }

        for (int i = 0; i < right.length; i++) {
            left[i] = left[i] * right[i];
        }

        return left;
    }
}
