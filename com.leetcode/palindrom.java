public class palindrom {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1563847412));
    }
    public static int isPalindrome(int x) {
        long num=0;
        int temp=0;
        if(x<0){
            temp = -x;
        }else{
            temp = x;
        }
        while(temp>0){
            num = num*10 + temp%10;
            temp=temp/10;
        }
        if( num < Integer.MIN_VALUE || num > Integer.MAX_VALUE){
            return 0;
        }else if(x<0){
            return (int)-num;
        }
        
        return (int)num;
    }
    public static int reverse(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum += lastDig;
            finalNum = finalNum*10;
            x= x/10;
        }
        finalNum = finalNum/10;
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            return 0;
        }
        if(x<0){
            return (int)(-1*finalNum);
        }
        return (int)finalNum;
    }
}

//-2147483648 to 2147483647
