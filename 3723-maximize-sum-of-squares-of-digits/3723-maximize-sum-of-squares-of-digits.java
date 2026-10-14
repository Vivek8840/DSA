class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // int nums[]={0,1,2,3,4,5,6,7,8,9};
        // StringBuilder sb=new StringBuilder();
        // while(num>0){
        //     if(sum>9){
        //         sb.append(9);
        //         sum=sum-9;

        //     }
        //     else {
        //         sb.append(sum);
        //         sum-=sum;
                
        //     }

        //     num--;
        // }
        // return (sum>0) ?"": sb.toString();


        // now mathmatics
        if(num*9<sum)
        return "";
        int val=sum/9;
        sum=sum%9;
        StringBuilder sb=new StringBuilder();
        sb.append("9".repeat(val));
        num-=val;
        if(sum>0){
            sb.append(sum);
            num--;
        }
        sb.append("0".repeat(num));
        return sb.toString();
    }
}