class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        if(n==1)
        return n;
        StringBuilder sb=new StringBuilder();
        char c=chars[0];
        int count=1;
        for(int i=1;i<n;i++){


            if(c==chars[i]){
                count++;
            }
            else{
                sb.append(c);
                if(count>1)
                sb.append(count);
                c=chars[i];
                count=1;
            }
        }
        sb.append(c);
        if(count>1){
            sb.append(count);
        }
        int idx=0;
        for(char d:sb.toString().toCharArray()){
            chars[idx++]=d;
        }
        return sb.length();
    }
}