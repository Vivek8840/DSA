class Solution {
    class Node{
        long score;
        List<Integer> indexs;
        public Node(long score, List<Integer> indexs){
            this.score=score;
            this.indexs=indexs;
        }

    }
    int n;
    int nextidx[];
    Node dp[][];

    public int[] maximumWeight(List<List<Integer>> intervals) {
        n=intervals.size();
        List<int[]> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int[] curr={
                intervals.get(i).get(0),
                intervals.get(i).get(1),
                intervals.get(i).get(2),
                i
            };
            arr.add(curr);
        }
        arr.sort((a,b)->Integer.compare(a[0],b[0]));
        nextidx=new int[n];
        dp=new Node[n][5];
        for(int i=0;i<n;i++){
            nextidx[i]=findnxt(arr,arr.get(i)[1]);
        }
        Node ans=solve(0,4,arr);
        int result[]=new int[ans.indexs.size()];
        for(int i=0;i<ans.indexs.size();i++){
            result[i]=ans.indexs.get(i);
        }
        return result;
    }
    private Node solve(int idx,int k,List<int[]> arr){
        if(idx>=n || k==0)
        return new Node(0,new ArrayList<>());

        if(dp[idx][k]!=null)
        return dp[idx][k];

        Node skip=solve(idx+1,k,arr);
        int weight=arr.get(idx)[2];
        Node nextnode=solve(nextidx[idx],k-1,arr);
        List<Integer> taken=new ArrayList<>(nextnode.indexs);
        taken.add(arr.get(idx)[3]);
        Collections.sort(taken);

        Node take=new Node(weight+nextnode.score, taken);
        Node result;

        if(take.score>skip.score)
        result=take;
        else if(take.score<skip.score)
        result=skip;
        else{
            if(compare(take.indexs,skip.indexs)<0)
            result=take;
            else
            result=skip;
        }
        return dp[idx][k]=result;
    }
    private int compare(List<Integer> a,List<Integer> b){
        int len=Math.min(a.size(),b.size());
        for(int i=0;i<len;i++){
            if(!a.get(i).equals(b.get(i))){
                return Integer.compare(a.get(i),b.get(i));
            }
        }
        return Integer.compare(a.size(),b.size());
    }
    private int findnxt(List<int[]> arr,int end){
        int l=0,r=n-1;
        int nas=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr.get(mid)[0]>end){
                nas=mid;
                r=mid-1;
            }
            else
            l=mid+1;
        }
        return nas;
    }
}