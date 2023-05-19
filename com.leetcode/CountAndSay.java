public class CountAndSay {
    public static void main(String[] args) {
        System.out.println("Last Call: "+countAndSay(39));
        
    }
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }else if(n==2){
            return "11";
        }
        String str = countAndSay(n-1);
        int count =1;
        String toReturn = "";
        int i =0;

        for(;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                toReturn += Integer.toString(count) + str.charAt(i);
                count =1;
            } 
        }
        toReturn += Integer.toString(count) + str.charAt(i);

        return toReturn;        
    }
}
