import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr = {3,2,1};

        System.out.println(Arrays.toString(arr));
        nextPermutation(arr);
    }
    public static void nextPermutation(int[] nums) {
        
        int lastPeak = 0;
        boolean isDes = true;
        
        for (int i = nums.length-1; i >0; i--) {
            if(nums[i] > nums[i-1]){
                isDes = false;
                lastPeak = i;                
                break;
            }
        }
        if(isDes){
            Arrays.sort(nums);
            System.out.println(Arrays.toString(nums));
            return;
        }
        int swapIndex1 = lastPeak-1;
        int swapIndex2 = lastPeak;
        for(int i=lastPeak+1;i<nums.length;i++){
            if(nums[i]>nums[swapIndex1] && nums[swapIndex2]>nums[i]){
                swapIndex2 = i;                
            }
        }
        int temp = nums[swapIndex1];
        nums[swapIndex1] = nums[swapIndex2];
        nums[swapIndex2] = temp;

        Arrays.sort(nums, lastPeak, nums.length);   

        System.out.println(Arrays.toString(nums));       
    }
}
