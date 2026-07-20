class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;

        for(int i=0;i<m;i++){
            mp.put(nums2[i],i);
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums1[i])){
                int idx=mp.get(nums1[i]);
                int x=-1;
                for(int j=idx+1;j<m;j++){
                    if(nums1[i]<nums2[j]){
                    x=nums2[j];
                    break;
                    }
                }
                ans[i]=x;
            }
        }
        return ans;
    }
}