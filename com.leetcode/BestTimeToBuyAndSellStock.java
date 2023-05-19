public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {1,2};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        
        int max = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int currentP = 0;
    
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowest){
                lowest = prices[i];
            }
            currentP = prices[i]-lowest;
            if(currentP>max){
                max = currentP;
            }
        }


        return max;
    }
}
