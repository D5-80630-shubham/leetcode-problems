public class MultiplyStrings {
    public static void main(String[] args) {

        String num1 = "123456789";
        String num2 = "987654321";
        System.out.println(multiply(num1, num2));
        
    }
    public static String multiply(String num1, String num2) {
        
        long t1=0,t2=0;
        long product = 0;

        for(int i=0;i<num1.length();i++){
            t1 += num1.charAt(i)-'0';
            t1 = t1*10;
        }
        t1 = t1/10;

        for(int i=0;i<num2.length();i++){
            t2 += num2.charAt(i)-'0';
            t2 = t2*10;
        }
        t2 = t2/10;

        product = t1*t2;
        System.out.println(product);
        
        return Long.toString(product);
    }
}
