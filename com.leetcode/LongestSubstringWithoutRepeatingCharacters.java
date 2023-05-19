public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String str = "ckilbkd";
        System.out.println(lengthOfLongestSubstring(str));
               
    }
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0,j=0; i < s.length(); i++) {
            int index = s.indexOf(s.charAt(i), j);

            if(index != i){
                j = index+1;
            }

            max = Math.max(max,i-j+1);
             
        }
        
        return max;
    }
}
