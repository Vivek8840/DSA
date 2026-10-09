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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode dum=new ListNode(0);
        dum.next=head;
       ListNode temp=dum,slow=dum;
       for(int i=0;i<n;i++){
        temp=temp.next;
       }
       while(temp.next!=null){
         temp=temp.next;
         slow=slow.next;

       }
       slow.next=slow.next.next;
       return dum.next;
        
    }
}