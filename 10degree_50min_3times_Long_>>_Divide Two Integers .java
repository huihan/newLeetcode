public class Solution {
    public int divide(int dividend, int divisor) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int res = 0;
        if(divisor == 1) return dividend;
        if(dividend == 0 || divisor == 0) return 0;
        boolean ret = true;
        if(dividend > 0 && divisor < 0 ) ret = false;
        if(dividend < 0 && divisor > 0 ) ret = false;
        long a =(long) Math.abs((long) dividend);
        long b =(long) Math.abs((long) divisor);
        while(a >= b){ 
            long tem=0;
            int t = 0;
            for(  t= 0 ; t < 32 ; t++){
                tem = b<<t; 
                if(a < tem) break;
            } 
            res+= 1<<--t;
            tem = tem>>1;
            a -= tem;
        }
        return ret?res:-res;
    }
}
