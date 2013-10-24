public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        int result  = -1;
        int begin = 0;
        for(int i = 0 ; i < s.length() ;i++){
            if( arr[s.charAt(i)] >= begin) 
                begin = arr[s.charAt(i)] +1; 
            arr[s.charAt(i)] = i; 
            result = Math.max(result , i - begin);
        }
        return result +1;
    }
}
