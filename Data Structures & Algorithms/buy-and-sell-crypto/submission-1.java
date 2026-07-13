class Solution {
    public int maxProfit(int[] prices) {
        int price=prices[0];
        int max=0;
        for(int i=0;i<prices.length;i++){
            price=Math.min(price,prices[i]);
            int profit=prices[i]-price;
            max=Math.max(profit,max);
        }
        return max;
    }
}
