class Solution {
    public boolean uniformArray(int[] nums1) {
        int n=nums1.length;
        int nums2[]=new int[n];
        Arrays.fill(nums2,-1);
        int  minodd=Integer.MAX_VALUE;
        int mineven=Integer.MAX_VALUE;
        for(int i:nums1){
            if(i%2==0){
                mineven=Math.min(mineven,i);
            }
            else
            minodd=Math.min(minodd,i);
        }
         
         if(minodd==Integer.MAX_VALUE || mineven==Integer.MAX_VALUE)
         return true;
         if(mineven!=Integer.MAX_VALUE && minodd<mineven)
         return true;
         return false;
            




        // boolean flag=(nums1[0]%2==0)?true:false;
        // for(int i=0;i<n;i++){
        //     if(flag){
        //         if(nums1[i]%2==0){
        //             nums2[i]=nums1[i];
        //         }
        //         else{
        //             for(int j=0;j<n;j++){
        //                 if(j!=i){
        //                     if(nums1[i]-nums1[j]>=1 && (nums1[i]-nums1[j])%2==0){
        //                     nums2[i]=nums1[i]-nums1[j];
        //                     break;
        //                     }
                           
                            
        //                 }

        //             }
        //             if(nums2[i]==-1)
        //             return false;
        //         }
        //     }
        //     else{
        //          if(nums1[i]%2!=0){
        //             nums2[i]=nums1[i];
        //         }
        //         else{
        //             for(int j=0;j<n;j++){
        //                 if(j!=i){
        //                     if(nums1[i]-nums1[j]>=1 && (nums1[i]-nums1[j])%2!=0){
        //                     nums2[i]=nums1[i]-nums1[j];
        //                     break;
        //                     }
                            
        //                 }

        //             }
        //             if(nums2[i]==-1)
        //             return false;
        //         }
        //     }


        // }
        // return true;

    }
}