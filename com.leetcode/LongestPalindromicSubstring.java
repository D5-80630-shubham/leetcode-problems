public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
        
    }
    public static String longestPalindrome(String s) {
        if(s.length()<2) return s;
        
        String str = s.substring(0);
        int start = 0;
        int end = s.length()-1;
        for(int i=0;i<end;i++){
            start = i;
            while(start<=end){
                if(s.charAt(start)==s.charAt(end)){
                    str = isPalindrom(s,start);                                    
                }else{
                    start++;
                }
                
            }
            int dif = s.length()-end;
            if(dif== start){
                   
            }
            end = s.length()-1;
            
        }
        

        return str;
    }
    public static String isPalindrom(String s,int start) {
        
        int end = s.length()-1;

        while(start<=end){
            if(s.charAt(start)== s.charAt(end)){
                start++;
                end--;
            }
            else{
                return "";
            }
        }

        return s;
    }
}
