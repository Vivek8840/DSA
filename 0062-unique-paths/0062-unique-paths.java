class Solution {
    // int value(int dp[][],int i,int j){
    //     if(i==0 && j==0)
    //     return 1;
    //     if(i<0 || j<0) return 0;
    //     if(dp[i][j]!=-1)
    //     return dp[i][j];
    //     int up=value(dp,i-1,j);
    //     int left=value(dp,i,j-1);
    //     return dp[i][j]=up+left;
    // }
    public int uniquePaths(int m, int n) {
 int dp[][]=new int[m][n];
 for(int row[]:dp){
    Arrays.fill(row,-1);
 }
   return calculate(dp,m-1,n-1);

    }
    private int calculate(int[][]dp,int i,int j){
        if(i==0||j==0)
        return 1;
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        dp[i][j]=calculate(dp,i-1,j)+calculate(dp,i,j-1);
        return dp[i][j];
    }
}