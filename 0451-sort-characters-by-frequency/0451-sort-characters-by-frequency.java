class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        if(n==1)
        return s;
        Map<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character,Integer>>li=new ArrayList<>(mp.entrySet());
        Collections.sort(li,(a,b)-> b.getValue()-a.getValue());

    StringBuilder sb=new StringBuilder();
    for(var e:li){
        char c=e.getKey();
        int run=e.getValue();
        for(int k=0;k<run;k++){
            sb.append(c);
        }
    }
    return sb.toString();
    }
}