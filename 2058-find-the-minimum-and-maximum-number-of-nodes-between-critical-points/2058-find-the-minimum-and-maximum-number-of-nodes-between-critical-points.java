/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int idx=0;
        ListNode back=head;
        ListNode curr=head.next;
        // ListNode front
        List<Integer> li=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        
        int init=Integer.MAX_VALUE;
        while(curr.next!=null){
            if(back.val>curr.val && curr.val< curr.next.val){
            li.add(idx);
            if(init !=Integer.MAX_VALUE)
            min=Math.min(min,idx-init);
            
           
            init=idx;
            }
            else if( back.val<curr.val && curr.val> curr.next.val){
            li.add(idx);
            if(init !=Integer.MAX_VALUE)
            min=Math.min(min,idx-init);
            
            init=idx;

            }

            idx++;
            back=curr;
            curr=curr.next;

        }
       

        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        if(li.size()>=2){
            // for(int i=1;i<li.size();i++){
            //     min=Math.min(min,li.get(i)-li.get(i-1));
            // }
            ans[0]=min;
            ans[1]=li.get(li.size()-1)-li.get(0);
            

        }
        return ans;
    }
}