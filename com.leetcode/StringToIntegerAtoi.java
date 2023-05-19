import java.util.HashMap;

public class StringToIntegerAtoi {
    public static void main(String[] args) {
        String s= "+-4";
        System.out.println(myAtoi(s));
        
    }
    public static int myAtoi(String s) {
        String str = "";
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put('0', 0);
        map.put('-', -1 );
        map.put('+', +1 );
        map.put('.',0);

        int x=1;

        for(;x<s.length();x++){
            if(s.charAt(x)==' ' && s.charAt(x-1)!=' '){
                break;
            }
        }

        for(int i=0;i<x;i++){
            if(map.containsKey(s.charAt(i)) ){
                if(s.charAt(i)=='.'){
                    break;
                }
                str += s.charAt(i);
            }
        }

        int convertedInt = 0;
        if(str != "" ){
            try {
                convertedInt = Integer.parseInt(str);
            } catch (Exception e) {
                // TODO: handle exception
                if(str.charAt(0)!='-'){
                    convertedInt = Integer.MAX_VALUE;
                }else{
                    convertedInt = Integer.MIN_VALUE;
                }
            }
            
        }

        return convertedInt;
    }
}

