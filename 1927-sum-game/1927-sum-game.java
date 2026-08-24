class Solution {
    public boolean sumGame(String num) {
      

        int lsum=0;
        int lq=0;
        int rsum=0;
        int rq=0;
        int i=0,j=num.length()-1;
        while(i<j){
            char c=num.charAt(i);
            char d=num.charAt(j);
            if(c!='?')
            lsum+=num.charAt(i)-'0';
            else
            lq++;
            if(d!='?')
            rsum+=d-'0';
            else
            rq++;
            i++;
            j--;
        }

        int qdiff=lq-rq;
        int sumdiff=lsum-rsum;

        return sumdiff*2!=-9*qdiff;
    }
}