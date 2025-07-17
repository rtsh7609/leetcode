class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int mp=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buy){
                int p=prices[i]-buy;
                mp=Math.max(mp,p);
            }
            else{
                buy=prices[i];
            }
        }
        return mp;
    }
}