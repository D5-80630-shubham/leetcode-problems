import java.util.Arrays;

public class LongestPrefixString {
    public static void main(String[] args) {
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(longestPrefixString(strs2));

    }


    public static String longestPrefixString(String[] strs) {

        Arrays.sort(strs);
        String s = "";
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i)==last.charAt(i)){
                s+= first.charAt(i);
            }else break;
        }

        return s;
    }

    // public static String longestPrefixString(String[] strs) {
    //     if(strs.length==1) return strs[0];
    //     boolean check = true;
    //     int iter = 0;
    //     while(check){
    //         int count = 0;
    //         check = false;
    //         for(int i=1;i<strs.length && iter<strs[i].length();i++){
    //             if(strs[iter]=="") break;
    //             if(strs[i-1].charAt(iter)==strs[i].charAt(iter)){
    //                 count++;
    //             }else break;
    //         }
    //         iter++;
    //         if(count==strs.length-1){
    //             check = true;
    //         }
    //         count =0;
    //     }
    //     String snew = "";
    //     for(int i=0;i<iter-1;i++){
    //         snew += strs[0].charAt(i);
    //     }

    //     return snew;
    // }   
}
