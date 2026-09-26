class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        int score =0;
        Arrays.sort(token);
        int n=token.length;
        int j=n;
        int ans=0;
        for(int i=0;i<n;i++){
            if(i==j)
            break;
            if(power>=token[i]){
                power-=token[i];
                score++;
            }
            else if(score >=1){
            //     power+=token[j-1];
            //     j-=1;
            //     score--;

            //     if(power>=token[i]){
            //     power-=token[i];
            //     score++;
            // }
            while(score>=1 && power<token[i]){
                      power+=token[j-1];
                j-=1;
                score--;
            }
                if(power>=token[i]){
                power-=token[i];
                score++;
            }
            }
            ans=Math.max(ans,score);
        }
        return ans;
    }
   
    
}