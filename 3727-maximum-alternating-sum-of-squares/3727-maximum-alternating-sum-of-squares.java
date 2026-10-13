class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        long sqnums[]=new long[n];
        for(int i=0;i<n;i++){
            sqnums[i]=nums[i]*nums[i];
        }
        Arrays.sort(sqnums);
        long ans=0;
        Boolean term=false;
        int i=0,j=n-1;
        while(i<=j){
            if(!term){
                ans+=sqnums[j];
                j--;
                term=true;
            }
            else
            {
                ans-=sqnums[i];
                i++;
                term=false;
            }
        }
        return ans;
    }
}