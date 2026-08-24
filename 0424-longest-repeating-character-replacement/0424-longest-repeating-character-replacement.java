class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
       int max=0;
       int l=0;
       int len=0;
       for(int r=0;r<s.length();r++){
            int idx=s.charAt(r)-'A';
            freq[idx]++;
            max=Math.max(freq[idx],max);
            int wsize=r-l+1;
            int diff=wsize-max;
            if(diff>k){
                int lidx=s.charAt(l)-'A';
                freq[lidx]--;
                l++;
            }
            len=Math.max(len,r-l+1);

       }
       return len;
    }
}