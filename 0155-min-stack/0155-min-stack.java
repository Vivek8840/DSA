class MinStack {
 int min;
 Stack<Integer> st;

    public MinStack() {
       
        st=new Stack<>();
        min=Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        st.push(val);
        min=Math.min(val,min);
    }
    
    public void pop() {
        if(st.isEmpty()){
            return ;
        }
        int top=st.pop();
        if(min ==top){
            min=Integer.MAX_VALUE;
        List<Integer> li=new ArrayList();
        while(!st.isEmpty()){
            min=Math.min(min,st.peek());
            li.add(st.pop());
        }
        for(int i=li.size()-1;i>=0;i--){
            st.push(li.get(i));
        }
            
        }
    }
    
    public int top() {
        if(!st.isEmpty())
        return st.peek();
        return st.peek();
    }
    
    public int getMin() {
        return min;

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */