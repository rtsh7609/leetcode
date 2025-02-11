class Solution {
    public int maxProfit(int[] prices) {
        int maxx=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else if(prices[i]-buy>maxx){
                maxx=prices[i]-buy;
            }
        }
        return maxx;
    }
}