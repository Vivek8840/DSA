class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        int min=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(min>nums[i]){
                // min=nums[i];
                idx=i;
                break;
            }
            min=nums[i];
        }
        if(idx==-1){
       reverse(nums,0,n-1);
    return;
        }
         
        
        
            
            // int temp=nums[n-1];
            // int num=nums[idx];
            // nums[idx]=temp;
            for(int i=n-1;i>idx;i--){
                if(nums[i]>nums[idx]){
                int val=nums[i];
                nums[i]=nums[idx];
                nums[idx]=val;

                break;
                }
            }
            reverse(nums,idx+1,n-1);
          
        
    }
    private void reverse(int nums[],int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}