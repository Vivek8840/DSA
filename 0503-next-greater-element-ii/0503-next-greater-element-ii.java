class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
           int x=-1;
            for(int j=i+1;j<n+i;j++){
                if(nums[j%n]>nums[i]){
                    x=nums[j%n];
                    break;
                }
            }
            ans[i]=x;
        }
        // for(int i=0;i<n;i++){
        //     if(nums[n-1]<nums[i]){
        //         ans[n-1]=nums[i];
        //         break;
        //     }
        // }
        return ans;
    }
}