class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        Boolean dp[]=new Boolean[n];
        return isSolve(0,n,nums,dp);
    }
    private boolean isSolve(int i,int n,int nums[],Boolean dp[]){
        if(i>=n-1)
        return true;
        if(dp[i]!=null)
        return dp[i];
          for(int j=1;j<=nums[i];j++){
            if(isSolve(j+i,n,nums,dp))
            return dp[i]=true;
          }
        return dp[i]=false;
    }
}