
import java.util.HashSet;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
    public static boolean isValid(String s) {
        HashSet<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        set.add('(');
        set.add('{');
        set.add('[');
            
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(set.contains(ch)){
                stack.push(ch);
                
            }
            else if(stack.isEmpty()){
                return false;
            }else {
                if(matched(stack.peek(),ch)){
                    stack.pop();
                }else return false;
            }
        }
        if(stack.isEmpty()) return true;

        return false;
    }
    public static boolean matched(char t1,char t2){
        if(t1=='(' && t2==')') return true;
        if(t1=='{' && t2=='}') return true;
        if(t1=='[' && t2==']') return true;

        return false;
    }
}
