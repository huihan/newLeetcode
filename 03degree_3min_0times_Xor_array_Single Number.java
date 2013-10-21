public class Solution {
    public int singleNumber(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int len = A.length;
        if(len <1) return 0;
        int single = A[0];
        for(int i = 1 ; i < len ; i++) single = single^ A[i];
        return single;
    }
}
