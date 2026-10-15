/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[][]}
 */
var levelOrder = function(root) {
    if(!root)
    return [];
    const res=[];
    let que=[root];
    while(que.length>0){
        const level=que.length;
        const curn=[];
        for(let i=0;i<level; i++){
            const node=que.shift();
            curn.push(node.val);

            if(node.left) que.push(node.left);
            if(node.right) que.push(node.right);

        }
        res.push(curn);

    }
    return res;

};