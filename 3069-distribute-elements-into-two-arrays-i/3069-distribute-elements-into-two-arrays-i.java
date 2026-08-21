class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int last1=nums[0];
        int last2=nums[1];
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<n;i++){
            if(last1>last2){
                last1=nums[i];
                l1.add(nums[i]);
            }
            else
            {
                last2=nums[i];
                l2.add(nums[i]);
            }
        }
        int idx=0;
        for(var i:l1){
            nums[idx++]=i;
        }
        for(var j:l2){
            nums[idx++]=j;
        }
        return nums;
    }
}