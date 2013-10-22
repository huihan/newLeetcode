public class Solution {
    int res;
    public int maxPathSum(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(root==null) return 0;
        res = root.val;
        solve(root);
        return res;
    }
    public int solve(TreeNode root){
        if(root == null) return -1;
        int l = solve(root.left);
        int r = solve(root.right);
        int re = Max3(root.val , root.val + l , root.val + r);
        res = Max3(res, re , root.val+l+r);
        return re;
    }
    public int Max3(int a , int b, int c){
        a = Math.max(a,b);
        return Math.max(a,c);
    }
}
