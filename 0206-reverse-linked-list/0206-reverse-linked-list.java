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
    public ListNode reverseList(ListNode head) {
        ListNode res=new ListNode();
        res.next=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode add=new ListNode();
            add.val=temp.val;
            ListNode join=res.next;
            res.next=add;
            add.next=join;
            temp=temp.next;
        }
        return res.next;
    }
}