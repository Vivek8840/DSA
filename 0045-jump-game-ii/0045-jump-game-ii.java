class Solution {
    public int jump(int[] nums) {
       int n=nums.length;
    //    int dp[]=new int[n];
    //    Arrays.fill(dp,-1);

    //    return solve(0,n,nums,dp); 
    int far=0;
    int jump=0;
    int curr=0;
    for(int i=0;i<n-1;i++){
        far=Math.max(far,i+nums[i]);
        if(i==curr)
        {
            jump++;
            curr=far;
        }
    }
    
    return jump;
    // private int solve(int i,int n,int nums[],int dp[]){
    //    if(i>=n-1)
    //    return 0;

    //    if(i+nums[i]>=n-1)
    //    return 1;
    //    if(dp[i]!=-1)
    //    return dp[i];

    //    int ans=Integer.MAX_VALUE-5;
    //    for(int j=i+1;j<=nums[i]+i;j++){
    //     ans=Math.min(ans,1+solve(j,n,nums,dp));
    //    }
    //     return dp[i]=ans;
    }
}