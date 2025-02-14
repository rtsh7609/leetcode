class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int lng=1;
        int max = Integer.MIN_VALUE;
     
            for(int j =1;j<nums.length;j++){
int current = j-1;
if(nums[current]<nums[j])
lng++;
else{
    max=Math.max(max,lng);
    lng=1;
}
                    }
 max=Math.max(max,lng);
    lng=1;
                            
                            return max;
    }
}