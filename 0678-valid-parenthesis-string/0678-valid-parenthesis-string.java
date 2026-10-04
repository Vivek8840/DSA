class Solution {
    static int n;
    public boolean checkValidString(String s) {
        n=s.length();
        Boolean dp[][]=new Boolean[n+1][n+1];

        return solve(0,0,s,dp);
    }
    private boolean solve(int idx,int req,String s, Boolean dp[][]){
        if (req<0)
        return false;
        if(idx==n)
        return req==0;
        if(dp[idx][req]!= null)
        return dp[idx][req];
        boolean ans;
        char c=s.charAt(idx);
        if(c=='(')
        ans= solve(idx+1,req+1,s,dp);
        else if(c=='*'){
            boolean isopen=solve(idx+1,req+1,s,dp);
            boolean isclose=solve(idx+1,req-1,s,dp);
            boolean isnon=solve(idx+1,req,s,dp);
            ans= isopen||isclose||isnon;
        }
        else
         ans=solve(idx+1,req-1,s,dp);

         return dp[idx][req]=ans;
    }
}