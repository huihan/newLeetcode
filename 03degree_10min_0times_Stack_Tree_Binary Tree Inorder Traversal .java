public class Solution {
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        stackPushTree(st,root);
        while(!st.isEmpty()){
            TreeNode tem = st.pop();
            res.add(tem.val);
            if(tem.right!=null) stackPushTree(st,tem.right);
        }
        return res;
    }
    public void stackPushTree(Stack<TreeNode> st , TreeNode root){
        while(root!=null){
            st.push(root);
            root = root.left;
        }
    }
}
