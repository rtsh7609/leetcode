class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]!=nums[i+1]){
                temp[j++]=nums[i];
            }
        }
        // nums[i]=temp[j++];
        temp[j++]=nums[n-1];
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
        return j;


    }
}