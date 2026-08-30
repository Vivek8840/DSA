class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int maxlen=n;
        int minlen=n;
        int maxidx=0;
        int minidx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[maxidx]){
               maxidx=i;
                maxlen=Math.min(i+1,n-i);

            }
            if(nums[i]<nums[minidx]){
                minidx=i;
            }

        }
        maxlen=Math.min(maxidx+1,n-maxidx);
        minlen=Math.min(minidx+1,n-minidx);
        int comb=Math.min(Math.max(minidx,maxidx)+1,n-Math.min(minidx,maxidx));
        return Math.min(maxlen+minlen,comb);

    }
}