class MedianOfTwoSortedArray{
    // https://leetcode.com/problems/median-of-two-sorted-arrays/
    public static void main(String[] args) {
        int nums1[] = {1,2,5};
        int nums2[] = {3,4,9};
        double ans = findMedianSortedArrays(nums1,nums2);
        System.out.println(ans);
    }
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] newArray = new int[m+n];
        int x= newArray.length;
        int i=0,j=0,k=0;
        double median = 0;
        
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                newArray[k]=nums1[i];
                k++;
                i++;
            }
            else{
                newArray[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(j<n){
            newArray[k]= nums2[j];
            j++;
            k++;
        }  
        while(i<m){
            newArray[k]= nums1[i];
            k++;
            i++;
        }
        if((x&1)==1){
            median = newArray[x/2];
        }
        else{
            median = (newArray[(x-1)/2] + newArray[x/2])/2;
        }
        
        return median;
    }
}