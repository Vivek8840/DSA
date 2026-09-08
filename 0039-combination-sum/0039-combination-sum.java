class Solution {
    public List<List<Integer>> combinationSum(int[] cds, int target) {
         int n=cds.length;
        
         
         List<List<Integer>> ans=new ArrayList<>();
         solve(0,target,cds,new ArrayList<>(),ans);

         return ans;
    }
    private void solve(int idx,int target,int nums[],List<Integer>li,List<List<Integer>> ans){
       if(target==0)
       {
        ans.add(new ArrayList<>(li));
        return;
       }
       if(idx==nums.length || target<0){
        return;
       }
       if(nums[idx]<=target){
        li.add(nums[idx]);
        solve(idx,target-nums[idx],nums,li,ans);
        li.remove(li.size()-1);
       }
       solve(idx+1,target,nums,li,ans);
       return;
    }
}