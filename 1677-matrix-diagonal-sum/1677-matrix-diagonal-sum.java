class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
            if(i!=n-1-i){
                sum+=mat[i][n-i-1];
            }
        }
        return sum;
    }
}