public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        return solve(preorder , 0  , preorder.length -1 , inorder, 0, inorder.length -1);
    }
    public TreeNode solve(int[] preorder , int a , int b , int[] inorder , int c , int d){
        if(b - a != d - c || a > b) return null; 
        if(a == b) return new TreeNode(preorder[a]);
        int mid = preorder[a];
        TreeNode root = new TreeNode(mid);
        int k = c;
        for(k = c ; k <= d ; k++){
            if(inorder[k] ==  mid) break;
        }
        root.left  = solve(preorder , a+1 , a + k - c  , inorder ,c , k-1);
        root.right = solve(preorder , a+1 + k - c , b  , inorder ,k+1 , d);
        return root;
    }
}
