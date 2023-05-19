// Leetcode 34
public class FirstAndLastInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,6,6,7,8,9,22,23,24,26};
        System.out.println(searchRange(arr, 66));
    }
    public static int[] searchRange(int[] nums, int target) {

        if(nums.length==0) return new int[] {-1,-1};
        if(nums.length==1) return new int[] {0,0};
        

        int firsttIndex = findindex(nums, target, true);
        int lastIndex = findindex(nums, target, false); 
        
        int[] indexArray = {firsttIndex,lastIndex};

        return indexArray;
    }
    public static int findindex(int[] nums,int target,boolean bool) {
        int start = 0;
        int end = nums.length-1;
        int mid=0;
        int ans = -1;
        while(start<=end){
            mid = (start + end)/2;
            if(nums[mid]<target){
                start = mid+1;
            }else if(nums[mid]> target){
                end = mid-1;
            }else{
                ans = mid;
                if(bool){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }             
        }

        return ans;
    }
}
