public class Solution {
    public int reverse(int x) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Queue<Integer> st = new LinkedList<Integer>();
        while(x!=0){
            st.offer(x%10);
            x = x/10;
        }
        int res = 0;
        while(!st.isEmpty()){
            res *=10;
            res+= st.poll();
        }
        return res;
    }
}
