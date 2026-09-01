class Solution {
    public int singleNumber(int[] nums) {
        
        int n=nums.length;
        int c=0;
       
        for(int i:nums){
            c^=i;
        }
        return c;

//         if(nums[0]!=nums[1])
//         return nums[0];
        
//         for(int i=1; i<nums.length-1; i++){
//             if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1]){
//                 c=nums[i];
//             return nums[i];
//             }
//         }
//         // if(nums[n-1]!=nums[n-2])
//         return nums[n-1];
//         // return c;

    }
}