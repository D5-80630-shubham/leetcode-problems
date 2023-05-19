// letcode 33
public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3,1};
        System.out.println(search(nums, 1));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid=0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid] < nums[0]){
                end = mid-1;
            }else if(nums[mid] > nums[0]) {
                start = mid+1;
            }else break;
        }
    
        if(target >= nums[0]) start = 0;
        else if(target < nums[0]) {
            start = end+1;
            end = nums.length-1;
        }
        while(start<=end){
            mid = start + (end-start)/2;
            if(target > nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }else return mid;
        }
        if(nums[end] == target) return end;

        return -1;
    }
}
