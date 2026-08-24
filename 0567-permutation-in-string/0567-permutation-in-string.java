class Solution {
    public boolean isEquals(Map<Character,Integer> mp,Map<Character,Integer> mn){
        if(mp.size()!=mn.size())
        return false;

       for(var e:mp.keySet()){
        if(!mn.containsKey(e))
        return false;
        else if(!mn.get(e).equals(mp.get(e)))
        return false;
       }
       return true;

    }

    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> mn=new HashMap<>();
        int n=s1.length();
        int m=s2.length();
        if(n>m)
        return false;

        for(char c:s1.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }

        int l=0;
        for(int r=0;r<s2.length();r++){
            char c=s2.charAt(r);
            mn.put(c,mn.getOrDefault(c,0)+1);

            if(r-l+1 ==n){
                if(isEquals(mp,mn))
                return true;
           
            char d=s2.charAt(l);
            int freq=mn.get(d)-1;
            if(freq==0)
            mn.remove(d);
            else
            mn.put(d,freq);
            l++;
           }
        }
        return false;
    }
}