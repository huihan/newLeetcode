public class Solution {
    public boolean canJump(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int cur = 0;
        int last = 0;
        while(cur >=0){
            if(cur >= A.length -1) return true;
            if(cur + A[cur] > last)
            {
                cur = cur+A[cur];
                last = cur;
            }
            else cur--;
        }
        return false;
    }
}
