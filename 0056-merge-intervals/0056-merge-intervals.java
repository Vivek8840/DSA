class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int st=intervals[0][0];
        int end=intervals[0][1];
        List<int[]> li=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(end>=intervals[i][0]){
                end=Math.max(end,intervals[i][1]);
            }
            else{
                li.add(new int[]{st,end});
                st=intervals[i][0];
                end=intervals[i][1];
            }
        }
        li.add(new int[]{st,end});
        return li.toArray(new int[li.size()][]);

    }
}