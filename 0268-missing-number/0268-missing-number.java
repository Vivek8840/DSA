class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        n=n+1;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int asum=n*(n-1)/2;
        return asum-sum;
        

    }
}