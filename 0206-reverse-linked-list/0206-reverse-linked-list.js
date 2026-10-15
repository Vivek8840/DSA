/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var reverseList = function(head) {
    let prev=null;
    let curn=head;
    while(curn!==null){
        let nextnode=curn.next;
        curn.next=prev;
        prev=curn;
        curn=nextnode;
    }
    return prev;
};