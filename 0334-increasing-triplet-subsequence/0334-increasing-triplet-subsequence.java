class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int suffix[]=new int[n];
        prefix[0]=nums[0];
        suffix[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefix[i]=Math.min(prefix[i-1],nums[i]);
        }
        for(int j=n-2;j>=0;j--){
            suffix[j]=Math.max(suffix[j+1],nums[j]);
        }
        for(int k=1;k<n-1;k++){
            if(nums[k]>prefix[k-1] && nums[k]<suffix[k+1])
            return true;
        }
        return false;
    }
}