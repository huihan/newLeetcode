public class Solution {
    public int minDepth(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        return l * r==0? 1+ Math.max(l,r) :1+Math.min(l,r);
    }
}
