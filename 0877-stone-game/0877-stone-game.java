class Solution {
    public boolean stoneGame(int[] piles) {
        int alice=0,bob=0;
        int lmax=0,rmax=0;
        int i=0,j=piles.length-1;
        boolean flag=true;
        while(i<j){
            lmax=piles[i];
            rmax=piles[j];
            if(flag){
                if(lmax>=rmax){
                    alice+=lmax;
                    i++;
                }
                else
                {
                    alice+=rmax;
                    j--;
                }
                flag=false;
            }
            else{
                 if(lmax<rmax){
                    bob+=lmax;
                    i++;
                }
                else
                {
                    bob+=rmax;
                    j--;
                }
                flag=true;
            }

        }
        return (alice>bob)? true:false;
        
    }
}