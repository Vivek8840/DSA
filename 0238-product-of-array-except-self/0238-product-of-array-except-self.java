class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int prefix=1;
        for(int i=0;i<n;i++){
            res[i]=nums[i]*prefix;
            prefix*=nums[i];
        }
        int suffix=1;
        for(int i=n-1;i>0;i--){
            res[i]=res[i-1]*suffix;
            suffix*=nums[i];
        }
        res[0]=suffix;
        return res;
    }
}