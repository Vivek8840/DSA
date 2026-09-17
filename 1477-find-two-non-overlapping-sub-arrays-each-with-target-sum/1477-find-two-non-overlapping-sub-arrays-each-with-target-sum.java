class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int l=0;
        int prebest[]=new int[n];
        Arrays.fill(prebest,Integer.MAX_VALUE);
        int result=Integer.MAX_VALUE;
        int cursum=0;
        int best=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            cursum+=arr[r];
            while(cursum>target){
                cursum-=arr[l++];
            }
            if( cursum==target){
                int len=r-l+1;
                if(l>0 && prebest[l-1]!=Integer.MAX_VALUE){
                result=Math.min(result,len+prebest[l-1]);
                }
                best=Math.min(best,len);
            }
            prebest[r]=best;
        }
        return result==Integer.MAX_VALUE?-1:result;
    }
}