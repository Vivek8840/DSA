class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int maxnum[]=new int[n];
        int minnum[]=new int[n];
        int j=n-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            maxnum[i]=max;
            min=Math.min(min,nums[j]);
            minnum[j]=min;
            j--;
        }
        int ans=0;
        
        // for(int i=0;i<n;i++){
        //     System.out.println("Maxnum :"+maxnum[i]+" Minnum:"+minnum[i]);
        // }
        for(int i=0;i<n;i++){
            if(maxnum[i]-minnum[i]<=k){
                return i;

            }
        }
        return -1;
    }
}