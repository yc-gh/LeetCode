//https://leetcode.com/problems/merge-two-binary-trees/

class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) return null;
        else if(t1==null) return t2;
        else if(t2==null) return t1;
        TreeNode t3 = new TreeNode(t1.val+t2.val);
        t3.left = mergeTrees(t1.left, t2.left);
        t3.right = mergeTrees(t1.right, t2.right);
        return t3;
    }
}
