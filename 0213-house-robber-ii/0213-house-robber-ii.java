class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
      if(n==1)
      return nums[0];
      int dp[]=new int[n];
      Arrays.fill(dp,-1);
      int c1=solve(0,n-2,nums,dp);
      Arrays.fill(dp,-1);
      int c2=solve(1,n-1,nums,dp);
      return Math.max(c1,c2);
      
        
    }
    private static int solve(int i,int e, int [] nums,int []dp){
        if(i>e){
            return 0;

        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+solve(i+2,e,nums,dp);
        int skip=solve(i+1,e,nums,dp);
        dp[i]=Math.max(take,skip);
        return dp[i];
    }
    // private static int solve(int i,int [] nums,int en){
    //    int dp1=0;
    //    int dp2=0;
    //    for(int j=i;j<=en;j++){
    //     int take= nums[j]+dp2;
    //     int skip=dp1;
    //     int curr=Math.max(take,skip);
    //     dp2=dp1;
    //     dp1=curr;

    //    }
    //    return dp1;
      
        

    

}