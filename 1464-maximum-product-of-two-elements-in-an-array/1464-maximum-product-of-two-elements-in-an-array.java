class Solution {
    public int maxProduct(int[] nums) {
        int max1=0,max2=0;
        for(int i:nums){
            if(i>max2){
                if(i>max1)
                {
                    max2=max1;
                    max1=i;
                }
                else
                max2=i;
            }
        }
        return (max2-1)*(max1-1);
    }
}