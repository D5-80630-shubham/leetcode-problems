import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 30
public class SubstringWithConcatenation {
    public static void main(String[] args) {

        String s = "barfoofoobarthethefoothe";
        String[] words = {"foo","the","bar"};

        System.out.println(findSubstring(s, words));
        
    } 
    
    
    public static List<Integer> findSubstring(String s, String[] words) {
        if(words.length==0 || s.length()==0) return new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        HashMap<String,Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }        
        int wordLength = words[0].length();
        int strLength = s.length();

        for (int i = 0; i < strLength-(wordLength*words.length)+1; i++) {
            HashMap<String,Integer> map2 = new HashMap<>();
            int wordCount=0;

            for (int j = 0; j < words.length; j++) {
                int index = i+j * wordLength;

                String word = s.substring(index, index+wordLength);
                map2.put(word,map2.getOrDefault(word,0)+1);

                if(!map.containsKey(word)){
                    break;
                }

                if(map2.get(word)>map.getOrDefault(word, 0)){
                    break;
                }
                wordCount++;
            }
            if(wordCount==words.length){
                list.add(i);
            }
        }
        return list;
    }
}
