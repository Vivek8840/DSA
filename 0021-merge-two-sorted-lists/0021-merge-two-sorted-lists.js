/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    let ans=new ListNode(0);
    let run=ans;
    while(list1 !==null && list2 !==null){
        let temp;
        if(list1.val<=list2.val){
           temp =list1;
           list1=list1.next;

        }
        else {
            temp=list2;
            list2=list2.next;
        }
            temp.next=null;
            run.next=temp;
            run=run.next;
    }
    if(list1!==null){
        run.next=list1;
    }
    if(list2!==null)
    run.next=list2;

    return ans.next;

    
};