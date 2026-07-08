// Last updated: 7/8/2026, 3:35:49 PM
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        TreeNode t=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(t);
        return root;
    }
}