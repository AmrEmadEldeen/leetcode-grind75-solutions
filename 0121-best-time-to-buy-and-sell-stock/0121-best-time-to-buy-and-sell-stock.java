class Solution {
    public int maxProfit(int[] prices) {
        int profit, maxProfit = 0,i=0;
       while( i < prices.length) {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[i] >= prices[j]){
                    break;
                }
                else{
                profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }}
            }
            i++;
        }
        return maxProfit;
    }
}