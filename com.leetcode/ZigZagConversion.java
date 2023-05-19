// leetcode 6

public class ZigZagConversion {
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        System.out.println(convert(str, 4));
        
    }
    public static String convert(String s, int numRows) {
        if(numRows<2) return s;
        
        char[][] zigZag = new char[numRows][s.length()];
        boolean dir = true;       
        for(int col =0,row = 0;col<s.length();){
            if(dir && row<numRows){
                zigZag[row++][col]= s.charAt(col++);
            }else{
                dir = false;
                if(row == numRows) row = row-2;
                if(row==0){
                    dir = true;
                    continue;
                }
                zigZag[row--][col] = s.charAt(col++);
            }            
        }

        String newstr = "";
        for (int i = 0; i < zigZag.length; i++) {
            for (int j =0;j<s.length();j++) {
                char ch = zigZag[i][j];
                if((ch>100-'0' && ch<173-'0') || ch == '.'||ch==','){
                    newstr += ch;
                    System.out.println(zigZag[i][j]);
                }
            }
        }
        return newstr;
    }
}
