public class Solution {
    public int longestConsecutive(int[] num) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i = 0 ;i < num.length ; i++){
            hs.add(num[i]);
        }
        int res = 0;
        for(int i = 0 ;i < num.length ;i++){
            res = Math.max(res, hashLongest(hs, num[i]));
        }
        return res;
    }
    public int hashLongest(HashSet<Integer> hs , int t){
        if(!hs.contains( t )) return 0;
        int res = 0 , pre = t-1;
        while(hs.contains(t)){
            hs.remove(t);
            res++;
            t++;
        }
        while(hs.contains(pre)){
            hs.remove(pre);
            res++;
            pre--;
        }
        return res;
    }
}
