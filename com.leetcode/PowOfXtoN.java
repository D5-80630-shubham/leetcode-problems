public class PowOfXtoN {
    public static void main(String[] args) {
        double x = 2.1;
        int n = 3;
        // System.out.println(myPow(x ,n));
        System.out.println(pow(x ,n));
    }
    public static double myPow(double x, int n) {
        if(n==0) return 1;

        double numX = x;
        int numN = n;
        if(n<0) numN = -1*n; 

        for(int i = 0;i<numN-1;i++){
            numX *=x;
        }
        if(n<0){
            numX = 1/numX;
        }
        return numX;
    }


    private static double pow(double x,int n) {
        double ans = x;
        int numN = n;
        if(n<0) numN = -1*n;
        int res = 1; 

        while (numN>0) {
            if(numN%2!=0) {
                res *= x;
                numN--;
            }else{
                ans *=x;
                numN = numN/2;
            }
            
            
        }
        ans *=res;
        System.out.println(ans);

        return 0;
    }
}
