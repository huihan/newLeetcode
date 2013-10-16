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
    public TreeNode sortedArrayToBST(int[] num) {
        // Note: The Solution object is instantiated only once and is reused by each test case. 
        
        return sortedArrayToBST_DP(num , 0 , num.length -1);
    }
    public TreeNode sortedArrayToBST_DP(int[] num,int p , int q){ 
         if(p > q) return null;
         if(p == q) return new TreeNode(num[p]);
         int r = (p+q)/2;
         TreeNode root = new TreeNode(num[r]);
         root.left = sortedArrayToBST_DP(num, p , r-1);
         root.right = sortedArrayToBST_DP(num,  r+1,q);
         return root;
    }
}
