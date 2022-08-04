public class bestTimetoBuyandSellStock2 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
        
    }
    public static int maxProfit(int[] prices){
        int max =0 ;
        for(int i=1;i!=prices.length;i++){
            max+=Math.max(0,prices[i]-prices[i-1]);
        }
        return max;
    }
}