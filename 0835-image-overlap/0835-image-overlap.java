class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n=img1.length;
        List<int[]> lone=new ArrayList<>();
        List<int[]> rone=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(img1[i][j]==1)
                lone.add(new int[]{i,j});
                if(img2[i][j]==1)
                rone.add(new int[]{i,j});
            }
        }
        Map<String,Integer> mp=new HashMap<>();
        int ans=0;
        for(int l[]:lone){
            for(int r[]:rone){
                int diffr=r[0]-l[0];
                int diffc=r[1]-l[1];
                String key=diffr+" "+diffc;
                int count=mp.getOrDefault(key,0)+1;
                mp.put(key,count);
                ans=Math.max(ans,count);
            }
        }
        return ans;
    }
}