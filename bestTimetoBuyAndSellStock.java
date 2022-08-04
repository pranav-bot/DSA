public class bestTimetoBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
        
    }
    public static int maxProfit(int[] prices){
        int price = prices[0];
        int max = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-price>0){
                max = Math.max(max, prices[i]-price);
            }
            else{
                price = prices[i];
            }
        }
        return max;
    }
    
}
