class Solution {
    public int reverseDegree(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        int val=26;
        for(char c='a';c<='z';c++){
            mp.put(c,val);
            val--;
        }
        long ans=0;
        for(int i=0;i<s.length();i++){
            int key=i+1;
            ans+=(mp.get(s.charAt(i))*key);
        }
        return (int) ans;
    }
}