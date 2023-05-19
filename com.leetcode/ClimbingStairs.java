public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
        
    }
    public static int climbStairs(int n) {

        if(n==0) return 0;
        if(n==1) return 1;
        int f =0,t1 = 0,t2=1;
        for(int i=0;i<n;i++){
            f = t1 + t2;
            t1 = t2;
            t2 = f;
        }
        return f;
    }
}
