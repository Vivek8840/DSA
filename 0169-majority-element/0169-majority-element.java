class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int ans=-1;
        int val=0;
        for(var k:mp.keySet()){
           if(val<mp.get(k)){
            val=mp.get(k);
            ans=k;
           }
        }
        return ans;
    }
}