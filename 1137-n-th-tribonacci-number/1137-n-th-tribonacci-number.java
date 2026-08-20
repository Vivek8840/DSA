class Solution {
    public int tribonacci(int n) {
        //return respective values of indexs
        // if(n==0)
        // return 0;
        // if(n==1)
        // return 1;
        // if(n==2)
        // return 1;
        
      
        // int a=0,b=1, c=1;
        // int res=0;
        // for(int i=3; i<=n; i++){
        //     res=a+b+c;
        //     //updating values of previos postions
        //     a=b;
        //     b=c;
        //     c=res;
        // }
        // return res;\
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return nthtribo(n,dp);
    }
    private int nthtribo(int n,int []dp){
        if(n==0||n==1)
        return n;
        if(n==2)
        return 1;
        if(dp[n]!=-1)return dp[n];
        int ans=nthtribo(n-1,dp)+nthtribo(n-2,dp)+
nthtribo(n-3,dp);
dp[n]=ans;
return dp[n];

    }
}