// Last updated: 7/8/2026, 3:37:39 PM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null||q==null) return p==q;
        return p.val==q.val &&
               isSameTree(p.left,q.left) &&
               isSameTree(p.right,q.right);
    }
}