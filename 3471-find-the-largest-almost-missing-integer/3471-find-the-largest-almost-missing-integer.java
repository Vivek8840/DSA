class Solution {
    public int largestInteger(int[] nums, int k) {
      Map<Integer,Integer> mp=new HashMap<>();
      for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
      }
        int max=-1;
        
      if(k==1){
        for(int i=0;i<nums.length;i++){
            if(max<nums[i] && mp.get(nums[i])==1){
                max=nums[i];

            }
        }
        return max;
      }
      if(k==nums.length){
        for(int i:nums){
            max=Math.max(i,max);
        }
        return max;
      }
    int num=nums[0];
   int num1=nums[nums.length-1];
   if(num1>num && mp.get(num1)==1)
   return num1;
   if(num>num1 && mp.get(num)==1)
   return num;
   if(mp.get(num)==1)
   return num;
   if(mp.get(num1)==1)
   return num1;
   return -1;

    }
}