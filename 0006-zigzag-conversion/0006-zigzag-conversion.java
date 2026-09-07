class Solution {
    public String convert(String s, int nr) {
        List<List<Character>> ans=new ArrayList<>();
        for(int i=0;i<nr;i++){
            ans.add(new ArrayList<>());
        }
        if(nr==1)
        return s;
        int i=0,z=0;
        boolean forward=true,backward=false;
        while(i<s.length()){
            char c=s.charAt(i);
            ans.get(z).add(c);
            if(z==0){
                z++;
                forward=true;
                backward=false;
            }
            else if(z== nr-1){
                z--;
                forward=false;
                backward=true;
            }
            else if(forward)
            z++;
            else if(backward)
            z--;

            i++;
        }

        StringBuilder sb=new StringBuilder("");
        for(int j=0;j<ans.size();j++){
            for(int m=0;m<ans.get(j).size();m++){
                sb.append(ans.get(j).get(m));
            }
        }
        return sb.toString();
    }
}