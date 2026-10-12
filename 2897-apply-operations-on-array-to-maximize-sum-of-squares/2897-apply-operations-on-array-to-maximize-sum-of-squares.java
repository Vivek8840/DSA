class Solution {
    static int mod=1000000000+7;
    public int maxSum(List<Integer> nums, int k) {
        int n=nums.size();
        int bitcount[]=new int[32];
        // int have[]=new int[32];
        for(var j:nums){
        for(int i=0;i<32;i++){
            if(  (j & (1 <<i )) >0){
                bitcount[i]++;
            }
            
        }
        }
        long sum=0;
        while(k-->0){
            long num=0;
            for(int i=0;i<32;i++){
                if(bitcount[i]>0){
                    num=(num | (1<<i));
                bitcount[i]--;
                }
            }
            sum=(sum+(num*num))%mod;
            // sum=sum%mod;
        }
        return (int)sum;
    }
}