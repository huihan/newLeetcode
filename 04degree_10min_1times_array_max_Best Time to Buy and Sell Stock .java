public class Solution {
    public int maxProfit(int[] prices) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(prices.length == 0) return 0;
        int[] dif = new int[prices.length];
        for(int i = 1 ; i < prices.length ; i++) 
            dif[i] =  prices[i]- prices[i-1]; 
        dif[0] = 0;
        int res = 0 ;
        for(int i = 1 ; i < prices.length ; i++){
            dif[i] = Math.max(dif[i] , dif[i-1] + dif[i]);
            res = Math.max(res,dif[i]);
        }
        return res;
    }
}
