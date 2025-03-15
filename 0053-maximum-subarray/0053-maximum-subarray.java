class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int total = 0;

        for (int n : nums) {
            if (total < 0) {
                total = 0;
            }

            total += n;
            res = Math.max(res, total);
        }

        return res;       
        // int cs=0;
        // int ms=nums[0];
        // int prefix[]=new int[nums.length];
        // prefix[0]=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     prefix[i]=prefix[i-1]+nums[i];
        // }
        // for(int i=0;i<nums.length;i++){
        //     int s=i;
        //     for(int j=i;j<nums.length;j++){
        //         int e=j;
        //         cs=s==0?prefix[e]:prefix[e]-prefix[s-1];
        //         if(ms<cs){
        //             ms=cs;
        //         }
        //     }
        // }
        // return ms;
    // int cs=0;
    // int ms=nums[0];
    // for(int i=0;i<nums.length;i++){
    //     cs+=nums[i];
    //     if(cs<0){
    //         cs=0;
    //     }
    //     ms=Math.max(ms,cs);
    // }
    // return ms;
    }
}