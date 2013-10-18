/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        flattenGetLast(root); 
    }
    public TreeNode flattenGetLast(TreeNode root){
        if(root == null || (root.left == null && root.right == null)) return root;
        if(root.left == null) return flattenGetLast(root.right);
        if(root.right == null) {
            root.right = root.left ;
            root.left = null;
            return flattenGetLast(root.right);
        }
        TreeNode l = root.left, r = root.right;
        root.left = null;
        root.right = l;
        l = flattenGetLast(l);
        l.right = r;
        return flattenGetLast(r);
    }
}
