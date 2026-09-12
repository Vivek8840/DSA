class Solution {
    int n;
    // int [][]dp=new int[100001][3];
    public int maxTwoEvents(int[][] events) {
        n=events.length;
        Arrays.sort(events,(a,b)->a[0]-b[0]);
       

        int dp[][]=new int[n+1][3];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        int count=0;
        return solve(0,count,events,dp);
        
    }
    private int solve(int idx,int count,int[][] events,int[][]dp){
      if(idx>=n || count==2)
      return 0;

      if(dp[idx][count]!=-1)
      return dp[idx][count];

      int nextidx=binarysearch(events, events[idx][1]);
      int take=events[idx][2]+solve(nextidx,count+1,events,dp);
      int nottaken=solve(idx+1,count,events,dp);
      return dp[idx][count]=Math.max(take,nottaken);
    }
    private int binarysearch(int [][] events,int num){
        int l=0,r=n-1;
        int result=n;
        while(l<=r){
          int  mid=l+(r-l)/2;
            if(events[mid][0]>num){
                result=mid;
                r=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        return result;
    }
}