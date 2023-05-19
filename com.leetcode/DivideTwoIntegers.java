public class DivideTwoIntegers {
    public static void main(String[] args) {

        // System.out.println(-2147483648/-1);
        
        System.out.println(divide(-2147483648, -1));
    }

    public static int divide(int dividend, int divisor) {
        
        int count = 0;
        int t1,t2;
        if(dividend <0 && divisor <0){
            t1 = -(dividend);
            t2 = -(divisor);
        }else if( dividend <0 && divisor >0  ){
            t1 = -(dividend);
            t2 = divisor;
        }else if(dividend >0 && divisor <0){
            t1 = dividend;
            t2 = -(divisor);
        }else{
            t1 = dividend;
            t2 = divisor;
        }
        
        while(t1 >= t2){
            t1 = t1 - t2;
            count++;
        }
        System.out.println(count);
        if((dividend <0 && divisor >0) ||(dividend >0 && divisor <0) || (dividend <0 && divisor <0) ){
            count = -(count);
            System.out.println("ygfugfyug  "+count);
        }

        if(count<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else if(count > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        // if((dividend <0 && divisor >0) ||(dividend >0 && divisor <0) ){
        //     return (int)-(count);
        // }else {
        //     return (int)count;
        // }
        return (int)(count);
    }
}
