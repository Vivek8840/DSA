class Solution {
    public String compare(String s,String t){
        int i=0;
        while(s.charAt(i)=='0'){
            i++;
        }
        s=s.substring(i,s.length());
        int j=0;
        while(t.charAt(j)=='0'){
            j++;

        }
        t=t.substring(j,t.length());

        int n=s.length();
        int m=t.length();
        if(n<m)
        return s;
        else if(m<n)
        return t;
        else{
            for(int p=0;p<n;p++){
                if(s.charAt(p)!=t.charAt(p)){
                    if(s.charAt(p)=='1')
                    return t;
                    else
                    return s;
                }
            }
        }
        return s;
    }
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        int l=0;
        // Map<String,Integer> mp=new HashMap<>();
        int one=0;
        String ans="";
        for(int r=0;r<n;r++){
                int c=s.charAt(r)-'0';
                if(c==1)
                one++;
                while(one>=k){
                if(one==k){
                    if(ans==""){
                        ans=s.substring(l,r+1);
                    }
                    else{
                        ans=compare(ans,s.substring(l,r+1));
                    }
                    // mp.put(s.substring(l,r+1),r-l+1);

                }
                    if(s.charAt(l)-'0'==1)
                    one--;
                    l++;
                }

        }
        // List<Map.Entry<String,Integer>>li=new ArrayList<>(mp.entrySet());
        // Collections.sort(li,(a,b)-> a.getValue()-b.getValue());

        // /String ans=li.getKey(0);

        return ans;

    }
}