public class AndOrXor {    
    public static void main(String[] args) {
        String str = "1A0A0A1A71";
        System.out.println(findSol(str));

    }    
    
    public static int findSol(String str) {
        int res = str.charAt(0) - '0';
        System.out.println("dfghj"+res);

        for(int i=1;i<str.length()-1;i=i+2){
            int temp = str.charAt(i+1)-'0';
            if(str.charAt(i)=='A'){
                res = res  & temp;
            }
            else if(str.charAt(i)=='B'){
                res = res  | temp;
            }
            else if(str.charAt(i)=='C'){
                res = res  ^ temp;
            }
        }
        return res;
    }
}
