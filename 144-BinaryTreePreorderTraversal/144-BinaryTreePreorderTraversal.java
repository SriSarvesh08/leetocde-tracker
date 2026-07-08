// Last updated: 7/8/2026, 3:36:34 PM
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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list = new LinkedList<>();
       preOrder(root,list);
       return list; 
    }
    void preOrder(TreeNode root, List<Integer> result){
        if(root==null)
        return ;
        result.add(root.val);  
        preOrder(root.left,result) ;
        preOrder(root.right,result);
       
    } 
}