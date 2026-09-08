class Solution {
    public List<List<Integer>> combinationSum2(int[] cds, int target) {
        Arrays.sort(cds);
        int n=cds.length;
        List<List<Integer>> ans=new ArrayList<>();
        solve(0,target,cds,new ArrayList<>(),ans); 
        return ans;
    }
    private void solve(int idx,int target, int nums[], List<Integer> li, List<List<Integer>> ans){


        if(target==0){
            ans.add(new ArrayList<>(li));
            return;
        }

        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1])
            continue;
            if(nums[i]>target)
            break;
            li.add(nums[i]);
            solve(i+1,target-nums[i],nums,li,ans);
            li.remove(li.size()-1);
        }
        
    }
    //     int n=cds.length;
        
         
    //      List<List<Integer>> ans=new ArrayList<>();
    //      Set<List<Integer>> st=new HashSet<>();
    //      solve(n-1,target,cds,new ArrayList<>(),ans,st);

         
    //      return ans;
    //      }
    //      private void solve(int idx,int target,int nums[],List<Integer>li,List<List<Integer>> ans,Set<List<Integer>> st){
    //    if(target==0)
    //    {
    //     List<Integer> temp=new ArrayList<>(li);
    //     Collections.sort(temp);
    //     if(!st.contains(temp))
    //     ans.add(temp);
    //     st.add(temp);
    //     return;
    //    }
    //    if(idx==0 || target<0){
    //     return;
    //    }
    //    if(nums[idx]<=target){
    //     li.add(nums[idx]);
    //     solve(idx-1,target-nums[idx],nums,li,ans,st);
    //     li.remove(li.size()-1);
    //    }
    //    solve(idx-1,target,nums,li,ans,st);
    //    return;
    // }
    
}