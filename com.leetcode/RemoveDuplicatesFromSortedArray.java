import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int k=0;
        int i = 1;
        for (; i <nums.length; i++) {
            if(nums[i-1] != nums[i]){
                nums[k++] = nums[i-1];
            }
        }
        nums[k++] = nums[i-1];
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
