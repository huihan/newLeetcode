public class Solution {
    public boolean isPalindrome(int x) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int t = x;
        int dx = 0;
        while(t != 0) {
            dx = dx*10 + t%10;
            t = t/10;
        }
        return dx == x &&x >=0 ;
    }
}
