public class LengthOfLastWord {
    public static void main(String[] args) {
        String  s = "ejb hgiu g" ;
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
        int lastSpace = 0;
        int wordCount =0;
        if(s.length()==1 && s.charAt(0)!=' ') return 1;
        
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)== ' ' && s.charAt(i)!= ' '){
                lastSpace = i-1;
                wordCount++;
            }
        }
        System.out.println(lastSpace);
        String lastWord = "";
        if(wordCount>0){
            for (int j = lastSpace+1; j < s.length(); j++) {
                if(s.charAt(j)==' ') break;
                lastWord += s.charAt(j);  
            }
        }else{
            for (int j = lastSpace; j < s.length(); j++) {
                if(s.charAt(j)==' ') break;
                lastWord += s.charAt(j);  
            }
        }

        

        System.out.println(lastWord);
        return lastWord.length();
    }
}
