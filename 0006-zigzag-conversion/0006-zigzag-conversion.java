class Solution {
    public String convert(String s, int row) {
        int n=s.length();
        if(row==1 || row>=n)
        return s;
        StringBuilder sb[]=new StringBuilder[row];
        for(int i=0;i<row;i++){
            sb[i]=new StringBuilder();
        }
        int r=0,d=1;
        for(char c:s.toCharArray()){
            sb[r].append(c);
            if(r==0)
            d=1;
            else if(r==row-1)
            d=-1;
             r+=d;
        }
        StringBuilder sbnext=new StringBuilder();
        for(var k:sb){
            sbnext.append(k);
        }
        String ress=sbnext.toString();
        return ress;
        
    }
}