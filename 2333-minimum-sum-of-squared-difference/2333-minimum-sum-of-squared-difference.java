class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n=nums1.length;
        int freq[]=new int[100001];
     int maxdiff=0;
        for(int i=0;i<n;i++){
            int diff=Math.abs(nums1[i]-nums2[i]);
            freq[diff]++;
            maxdiff=Math.max(maxdiff,diff);
        }
        long k=(long)k1+k2;
        for(int d=maxdiff;d>0 && k>=0; d--){
            if(freq[d]==0)
            continue;

            long needed=freq[d];
            if(k>needed){
                k-=needed;
                freq[d-1]+=freq[d];
                freq[d]=0;
            }
            else {
                freq[d]-=(int)k;
                freq[d-1]+=(int)k;
                k=-1;
            }
        }
        long ans=0;
        for(int i=0;i<=100000;i++){
            if(freq[i]>0){
                long diff=i;
                ans+=diff*diff*freq[i];
            }
        }
        return ans;

        
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        // // int n=nums1.length;
        // for(int i=0;i<n;i++){
        //     pq.add(Math.abs(nums1[i]-nums2[i]));
        // }
        // while(k>0 && !pq.isEmpty()){
        //     int num=pq.remove();
        //     num--;
        //     k--;
        //     if(num>0)
        //     pq.add(num);
        // }
        // while(!pq.isEmpty()){
        //     int num=pq.remove();
        //     sum+=num*num;
        // }
        // return sum;
        // int incr2=Math.min(k1,k2);
        // int incr1=Math.max(k1,k2)-incr2;
        // long sum=0;
        // while(!pq.isEmpty()){

        //         int num=pq.remove();
        //     if(k1>0){
        //         num=num-1;
        //         k1--;
                
        //     }
        //     else if(k2>0){
        //         num=num-1;
        //         k2--;
        //     }
        //     sum+=num*num;
        // }
        // return sum;
    }
}