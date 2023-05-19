import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {

        System.out.println(romanToInt("X"));
        
    }
    public static int romanToInt(String s) {
       
        int sum = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        if(s.length()==1){
            sum = map.get(s.charAt(0));
        }else{
            for(int i=1;i<s.length();i++){
                int temp = map.get(s.charAt(i-1));
                int temp2 = map.get(s.charAt(i));
                if(temp>=temp2){ 
                    sum = sum + temp;                
                }else if(temp<temp2){
                    sum = sum - temp;
                }
                
                if(i==s.length()-1){
                    sum = sum + map.get(s.charAt(i));
                }
            }
        }
        
        return sum;
    }  
}
