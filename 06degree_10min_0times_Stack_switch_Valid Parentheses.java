public class Solution {
    public boolean isValid(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Stack<Character> st = new Stack<Character>();
        if(s.length() == 0) return true;
        if(s.length() % 2 == 1) return false;
        for(int i = 0 ; i < s.length() ; i++){
            switch(s.charAt(i)){
                case '(':
                case '[':
                case '{':
                    st.push(s.charAt(i));
                    break;
                case ')':
                    if(st.isEmpty() || st.pop() != '(') return false;
                    break;
                case ']':
                    if(st.isEmpty() || st.pop() != '[') return false;
                    break;
                case '}': 
                    if(st.isEmpty() || st.pop() != '{') return false;
                    break;
                default: return false;
            }
        }
        return st.isEmpty();
    }
}
