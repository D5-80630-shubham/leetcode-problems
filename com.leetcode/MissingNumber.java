public class MissingNumber {
    public static void main(String[] args) {
        
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int elementSum = 0;

        int exactSum = (n*(n+1))/2;
        for(int i=0;i<n;i++){
            elementSum += nums[i];
        }
        
        return exactSum - elementSum;
    }
}
