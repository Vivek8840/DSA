class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int m=og.length;
        int n=og[0].length;
        int dp[][]=new int[m][n];
        if(og[m-1][n-1]==1)
        return 0;
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        return count(m-1,n-1,og,dp);
    }
    private int count(int m,int n, int[][]og,int[][]dp){
        if(m<0 || n<0)
        return 0;
        if(og[m][n]==1)
        return 0;
        if(m==0&&n==0)
        return 1;
        if(dp[m][n]!=-1)
        return dp[m][n];
      
        
       int up=count(m-1,n,og,dp);
        
       int left=count(m,n-1,og,dp);
        dp[m][n]=up+left;

        return dp[m][n];
    }
}