public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        
        int sum=Integer.MIN_VALUE;
        int tempsum = 0;

        for(int i=0;i<nums.length;i++){
           tempsum += nums[i];
           if(nums[i]>tempsum){
            tempsum = nums[i];
           }
           if(tempsum>sum){
                sum = tempsum;
           }
        }
        
        return sum;
    }
}
