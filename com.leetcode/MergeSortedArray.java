import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m= 3,n= nums2.length;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m];
        int k=0;
        for(int i=0;i<m;i++){
            temp[i] = nums1[i];
        }
        for(int i=0,j=0;i<m && j<n;k++){
            if(temp[i]>nums2[j]){
                nums1[k]= nums2[j];
                nums2[j] = Integer.MIN_VALUE;
                j++;
                
            }else{
                nums1[k]= temp[i];
                temp[i] = Integer.MIN_VALUE;
                i++;
                
            }
        }
        for(int i=0;i<m;i++){
            if(temp[i]!=Integer.MIN_VALUE){
                nums1[k] = temp[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums2[i]!=Integer.MIN_VALUE){
                nums1[k]= nums2[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(temp)+" : "+k);
        
    }
    public static boolean isSet(int[] arr){
        

        return false;
    }
}
