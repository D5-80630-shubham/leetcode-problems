
public class FindDuplicateNumber {
    public static void main(String[] args) {

        int[] arr = {3,1,3,2};
        System.out.println(findDuplicate(arr));
        
    }
    public static int findDuplicate(int[] nums) {
        int num=0;
        boolean[] bool = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(!bool[temp]){
                bool[temp] = true;
            }else{
                num = temp;
            }
            
        }
        
        return num;
    }
    public static void swap(int[] arr,int a,int b){
        int temp= arr[a];
        arr[a]= arr[b];
        arr[b]= temp;
    }
}
