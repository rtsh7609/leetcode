class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int ms=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int p=prices[i]-buy;
                ms=Math.max(p,ms);
            }
            else{
                buy=prices[i];
            }
        }
        return ms;
    }
}