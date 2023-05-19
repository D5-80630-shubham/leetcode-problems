public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 5));
    }
    public static int searchInsert(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end/2);
        while(start<=end){
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
                mid = (start+end)/2;
            }else{
                end = mid-1;
                mid = (start+end)/2;
            }

        }

        return -1;
    }
}
