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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(var list:lists){
            ListNode temp=list;
            while(temp!=null){
                pq.add(temp.val);
                // System.out.println("temp.val :"+temp.val);
                temp=temp.next;
            }
        }
        ListNode res=new ListNode();
       ListNode run=res;
        while(!pq.isEmpty()){
            
            ListNode temp=new ListNode(pq.remove());
            run.next=temp;
            run=run.next;
        }
        res=res.next;
        return res;
        
        
    }
}