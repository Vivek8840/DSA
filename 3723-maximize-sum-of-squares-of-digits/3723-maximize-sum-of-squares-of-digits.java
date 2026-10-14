class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int nums[]={0,1,2,3,4,5,6,7,8,9};
        StringBuilder sb=new StringBuilder();
        while(num>0){
            if(sum>9){
                sb.append(9);
                sum=sum-9;

            }
            else {
                sb.append(sum);
                sum-=sum;
                
            }
            num--;
        }
        return (sum>0) ?"": sb.toString();
    }
}