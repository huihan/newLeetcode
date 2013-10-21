public class Solution {
    public ArrayList<String> generateParenthesis(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<String> ret = new ArrayList<String>();
        solve(n , 0 , 0 , new StringBuilder() , ret);
        return ret;
    }
    public void solve(int n , int l , int r , StringBuilder s , ArrayList<String> ret){
        if(l == n && r == n) {
            ret.add(s.toString());
            return;
        }
        if(l < n ){
            s.append('(');
            solve(n,l+1 , r ,s, ret);
            s.deleteCharAt(s.length()-1);
        }
        if(l > r){
            s.append(')');
            solve(n,l , r+1 , s , ret);
            s.deleteCharAt(s.length()-1);
        }
    }
}
