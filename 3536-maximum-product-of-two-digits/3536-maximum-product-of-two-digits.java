class Solution {
    public int maxProduct(int n) {
       int max1=0,max2=0;
       while(n>0){
            int p=n%10;
            if(p>max2){
                if(p>=max1){
                    max2=max1;
                    max1=p;
                }
                else
                max2=p;
            }
            n=n/10;
       }
       return max1*max2;
    }
}