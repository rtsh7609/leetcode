class Solution {
    public int maxProfit(int[] prices) {
       int buy=prices[0];
       int m=0;
       for(int i=0;i<prices.length;i++){
        if(buy<prices[i]){
            int p=prices[i]-buy;
            m=Math.max(m,p);
        }
        else{
            buy=prices[i];
        }

       }
       return m; 
    }
}