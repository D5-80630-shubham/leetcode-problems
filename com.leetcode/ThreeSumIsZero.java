import java.util.ArrayList;
import java.util.List;

class ThreeSumIsZero {
    public static void main(String[] args) {
        int[] nums = {0,1,1,-2,0,0};
        System.out.println(threeSum(nums));
        
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int i=0;

        for(int x=0;x<nums.length;x++){            
            for(int y=x+1;y<nums.length;y++){
                for(int z=y+1;z<nums.length;z++){
                    
                    if(nums[x]+ nums[y] + nums[z]==0){
                        ArrayList<Integer> innerList = new ArrayList<>();
                        
                        innerList.add(nums[x]);
                        innerList.add(nums[y]);
                        innerList.add(nums[z]);   
                        list.add(i++, innerList);
                    }                   
                }
            }            
        }
        
        return list;
    }
}