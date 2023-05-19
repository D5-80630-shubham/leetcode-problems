public class CountNumberOfBadPairs {
    public static void main(String[] args) {
        int[] arr = {4,1,3,3};
        System.out.println(countBadPairs(arr));
    }
    public static long countBadPairs(int[] nums) {

        long count =0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(j-i != nums[j] - nums[i]){
                    count++;
                }
            }
        }
        return count;
    }
}
