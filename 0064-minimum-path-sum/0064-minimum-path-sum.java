class Solution {
    static int solve(int i,int j, int [][] grid, int [][] dp){
        if(i<0 || j<0)
        return Integer.MAX_VALUE;
        if(i==0 && j==0)
        return grid[i][j];

        if(dp[i][j]!=-1)
        return dp[i][j];

        dp[i][j]=grid[i][j]+Math.min(solve(i-1,j,grid,dp),solve(i,j-1,grid,dp));
        return dp[i][j];


    }
    public int minPathSum(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        int dp[][]=new int[m][n];
        for(int [] d:dp){
            Arrays.fill(d,-1);
        }
        return solve(m-1,n-1,grid,dp);
        
    }
}