class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=height[0];
        r[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            l[i]=Math.max(height[i],l[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(height[i],r[i+1]);
        }
        int trap=0;
        for(int i=0;i<n;i++){
            int water=Math.min(l[i],r[i]);
            trap+=water-height[i];
        }
        return trap;
    }
}