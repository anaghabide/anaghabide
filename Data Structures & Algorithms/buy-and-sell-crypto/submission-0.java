class Solution {
    public int maxProfit(int[] prices) {
       int profit = 0;
       int minPrice = Integer.MAX_VALUE;
       int buy_day = 0, sell_day = 0, buy_price = 0, sell_price = 0;
       int min_day=0;
       for(int i=0; i<prices.length; i++){
        int currPrice= prices[i];
        if(currPrice<minPrice){
            minPrice = currPrice; //buy day
            min_day = i;
        }else{
            profit = Math.max(profit, currPrice-minPrice);
            sell_price = currPrice;
            buy_price = minPrice;
            sell_day = i;
            buy_day = min_day;
        }
       }
       System.out.println("buy day :: " + buy_day);
       System.out.println("buy price :: " + buy_price);
       System.out.println("sell day :: " + sell_day);
       System.out.println("sell price :: " + sell_price);
       return profit;
    }
}
