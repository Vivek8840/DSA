class Solution {
    public int[] dailyTemperatures(int[] tem) {
     int n=tem.length;
     int ans[]=new int[n];
     
     Stack<Integer> st=new Stack<>();
     for(int i=0;i<n;i++){

        while(!st.isEmpty() && tem[st.peek()]<tem[i]){
            ans[st.peek()]=i-st.pop();
            
        }
        st.push(i);
     }
     return ans;
    }
}