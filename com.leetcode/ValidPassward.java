public class ValidPassward {
    public static void main(String[] args) {
        
        String str = "a1A_00";
        System.out.println(isValid(str));
    }
    public static int isValid(String str) {
        if(str.length()<4 || str.charAt(0)<10) return 0;
        boolean bool1 =false;
        boolean bool2 =false;
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>100 && ch<133){
                bool1 = true;
            }else if(ch-'0'<10 && ch-'0'>=0){
                bool2 = true;
            }else if(ch == ' ' || ch == '/'){
                return 0;
            }
        }

        if(bool1 && bool2){
            return 1;
        }

        return 0;
    }
}
