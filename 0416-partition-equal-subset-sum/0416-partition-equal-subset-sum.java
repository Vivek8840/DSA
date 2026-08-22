class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums)
        sum+=i;
        if(sum%2!=0)
        return false;
        int dp[][]=new int[n][sum/2+1];
        // Map<Integer,Integer> mp=new HashMap<>();
        for(int d[]:dp){
            Arrays.fill(d,-1);
        }
        return solve(n-1,sum/2,nums,dp);
    }
    private boolean solve(int idx, int sum,int nums[],int dp[][]){
       if(sum==0)
       return true;
        if(idx==0)
        return sum==nums[idx];
        if(dp[idx][sum]!=-1)
        return dp[idx][sum]==1;

        boolean ntaken=solve(idx-1,sum,nums,dp);
        boolean taken=false;
        if(nums[idx]<=sum){
            taken=solve(idx-1,sum-nums[idx],nums,dp);
        }
        dp[idx][sum]=(taken || ntaken)?1:0;
        return (taken||ntaken);



    }
}