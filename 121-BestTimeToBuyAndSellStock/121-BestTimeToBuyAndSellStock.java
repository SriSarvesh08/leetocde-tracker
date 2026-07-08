// Last updated: 7/8/2026, 3:37:09 PM
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],profit=0;
        for(int p:prices){
            min=Math.min(min,p);
            profit=Math.max(profit,p-min);
        }
        return profit;
    }
}