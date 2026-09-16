class Solution {
    public boolean isPlaindrome(String s,int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        if(k==1)
        return n;
        int dp[][]=new int[n+1][n+1];
        // for(int row[]:dp){
        //     Arrays.fill(row,-1);
        // }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(isPlaindrome(s,i,j)){
                    int take=1+ ((j+k<=n)?dp[j+1][j+k]:0);
                    int grow=dp[i][j+1];
                    int slide=dp[i+1][j+1];
                    dp[i][j]=Math.max(Math.max(take,grow),slide);
                }
               
                    int grow=dp[i][j+1];
                    int slide=dp[i+1][j+1];
                    dp[i][j]=Math.max(Math.max(dp[i][j],grow),slide);
               

            }
        }
        return dp[0][k-1];
    }
}