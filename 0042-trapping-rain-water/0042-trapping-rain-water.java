class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l[]=new int[n];
        l[0]=height[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],height[i]);
        }
        int r[]=new int[n];
        r[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],height[i]);
        }
        int trap=0;
        for(int i=0;i<n;i++){
            int w=Math.min(l[i],r[i]);
            trap+=w-height[i];
        }

        return trap;
    }
}