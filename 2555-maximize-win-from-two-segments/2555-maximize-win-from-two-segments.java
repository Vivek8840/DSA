class Solution {
    public int maximizeWin(int[] position, int k) {
        int n=position.length;
        // if(k==0)
        // return Math.min(2,n);
        int left[]=new int[n+1];
        left[0]=1;
        int right[]=new int[n+1];
        right[n-1]=1;
        int st=0;
        for(int l=1;l<n;l++){
            while(position[l]-position[st]>k)
            st++;
            left[l]=Math.max(left[l-1],l-st+1);
        }

        st=n-1;
        for(int j=n-1; j>=0;j--){
            while(position[st]-position[j]>k)
            st--;
            right[j]=Math.max(right[j+1],st-j+1);
        }
        int ans=0;
        for(int i=0;i<=n;i++){
            ans=Math.max(ans,(i==0?0:left[i-1])+ (i==n?0:right[i]));
        }
        return ans;
    }
}