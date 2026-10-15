/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    // let fast=head;
    // let slow=head;
    // while(fast!==null && fast.next!=null){
    //     fast=fast.next.next;
    //     slow=slow.next;
    //     if(fast=== slow){
    //         return true;


    //     }
    // }
    // return false;

    let temp=head;
    const set=new Set();
    while(temp!==null){
        if(set.has(temp))
        return true;
        set.add(temp);
        temp=temp.next;
    }
  return false;
};