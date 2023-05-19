import java.util.Arrays;

public class SocialNetwork {
    public static void main(String[] args) {
        int n = 16;
        int count=0;
        boolean[] bol = new boolean[n];
        System.out.println(bol.length);

        for (int i = 2; i < n+2; i++) {
            for (int j = 2; j < (n+2)/2;j++) {
                if(i+i<n+2){
                    bol[i-2] = true;
                    break;
                }else if(i%j==0){
                    bol[i-2] = true;
                    break;
                }else bol[i-2] = false;
                
            }
        }
        for(int i=0;i<bol.length;i++){
            if(!bol[i]){
                count++;
            }
        }
        System.out.println(Arrays.toString(bol));
        System.out.println(count+1);
    }   
}
