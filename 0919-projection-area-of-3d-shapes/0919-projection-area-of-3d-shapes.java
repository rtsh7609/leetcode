class Solution {
    public int projectionArea(int[][] grid) {
        int a=0,x=0;
        for(int i=0;i<grid.length;i++)
        {
            int mr=Integer.MIN_VALUE;
            int mc=Integer.MIN_VALUE;
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=0)x+=1;
                if(grid[i][j]>mr)mr=grid[i][j];
                if(grid[j][i]>mc)mc=grid[j][i];
            }
            a+=mr+mc;
        }
        return (a+x);
    }
}