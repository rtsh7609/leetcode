class Solution {
    public boolean isHappy(int n) {
        
        
        while (n > 9) {
            int sum = 0;
            while (n != 0) {
                int rem = n % 10;
                sum += rem * rem;
                n /= 10;
            }
            if(sum==1) return true;
            else n=sum;
        }
        return n==1|| n==7?true:false;

    }
}