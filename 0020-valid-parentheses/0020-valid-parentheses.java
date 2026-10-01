class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(st.isEmpty())
            st.push(c);
           
           else if((st.peek()=='(' && c==')') || (st.peek()=='{' && c=='}') || (st.peek()=='[' && c==']'))
           st.pop(); 
           else
           st.push(c);
        }
        return st.isEmpty();
    }
}