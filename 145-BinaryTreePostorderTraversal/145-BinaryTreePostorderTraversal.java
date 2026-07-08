// Last updated: 7/8/2026, 3:36:33 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> list = new LinkedList<>();
       postOrder(root,list);
       return list; 
    }
    void postOrder(TreeNode root, List<Integer> result){
        if(root==null)
        return ;
        postOrder(root.left,result) ;
        postOrder(root.right,result);
        result.add(root.val); 
    } 
}