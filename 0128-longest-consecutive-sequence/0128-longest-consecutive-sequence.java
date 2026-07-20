class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int i:nums)
        st.add(i);
      int ans=0;
      int count=0;
        for(int i:st){
            if(!st.contains(i-1)){
                int x=i;
                while(st.contains(x)){
                    count++;
                    x++;
                }
                ans=Math.max(count,ans);
                count=0;

            }
            else
            count=0;

        }
        return ans;
    }
}