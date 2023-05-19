import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<candidates.length;i++){
            int temp = candidates[i];
            int toCheck = target%temp;
            if(toCheck != 0){
                for (int j = 0; j < candidates.length; j++) {
                    
                }
            }
        }

        return list;
    }
}
