class Solution {
    public int peakIndexInMountainArray(int[] arr) {
         int l=0,r=arr.length-1;
         int peakidx=-1;
    while(l<r){
        int mid=(l+r)/2;
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
            peakidx=mid;
            break;
        }
        else if (arr[mid]>arr[mid+1])
            r=mid;
        else
            l=mid;
    }
    return peakidx;
    }
}