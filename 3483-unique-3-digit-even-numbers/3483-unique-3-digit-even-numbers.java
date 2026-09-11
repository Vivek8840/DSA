class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        HashSet<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]==0)
            continue;
            for(int j=0;j<n;j++){
                if(j==i)
                continue;
                for(int k=0;k<n;k++){
                    if(k==j || k==i)
                    continue;
                    if(digits[k]%2==0){
                    int num=digits[i]*100+digits[j]*10+digits[k];
                    st.add(num);
                    }
                }
            }
        }
        return st.size();
    }
}