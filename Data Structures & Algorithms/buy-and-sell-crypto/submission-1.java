class Solution {
    public int maxProfit(int[] prices) {
        int bestbuy = prices[0];
        int maxP = 0;

        for(int i=1;i<prices.length;i++)
        {
           bestbuy = Math.min(bestbuy , prices[i]);
           maxP = Math.max(maxP,prices[i] - bestbuy);
        }
        return maxP;
    }
}
