import java.util.*;
// leetcode 17
public class LetterCombinationsPhoneNumber {
    public static void main(String[] args) {
        String digits = "423";
        System.out.println(letterCombinations(digits));
        
    }
    public static List<String> letterCombinations(String digits) {

        List<String> list = new ArrayList<>();
        int pointingIndex =digits.length()-1;
        String eachCombination = "";
        String[] letterMap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        findCombination(letterMap,eachCombination ,pointingIndex,list,digits);

        return list;
    }
    public static void findCombination(String[] str, String eachCombination ,int pointingIndex ,List<String> list,String digits) {

        if(pointingIndex<0) return ;
        int dig = digits.charAt(pointingIndex)-'0';
        System.out.println(dig);
        
        findCombination(str, eachCombination, pointingIndex-1, list, digits);

        for(int i=0;i<str[dig].length();i++){
            eachCombination += str[dig].charAt(i) ;
            
        }
        
    }
}
