class Solution {
    public int maxSubArray(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int curn=0;
        for(int i:nums){
            curn+=i;
            ans=Math.max(ans,curn);
            curn=Math.max(0,curn);
        }
        return ans;
    }
}