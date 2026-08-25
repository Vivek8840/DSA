class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> st=new HashSet<>();
        int max=0;
        for(int i:nums){
        st.add(i);
        max=Math.max(i,max);
        }
        int run=max/k+2;
        for(int i=1;i<=run;i++){
            if(!st.contains(k*i))
            return k*i;
        }

        return k;
    }
}