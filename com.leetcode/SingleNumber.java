public class SingleNumber {
    public static void main(String[] args) {

        int[] arr = {3,5,3,1,2,2,1};

        System.out.println(singleNumber(arr));
    }
    public static int singleNumber(int[] nums) {
        int num = 0;
        
        for(int i=0;i<nums.length;i++){
            num = num ^ nums[i];
        }
        return num;
    }
}
