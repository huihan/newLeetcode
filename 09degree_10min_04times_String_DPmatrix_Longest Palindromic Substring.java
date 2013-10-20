public class Solution {
    public String longestPalindrome(String s) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int len = s.length();
        if(len == 0) return "";
        boolean[][] mat = new boolean[len][len];
        for(int i = 0 ; i < len ; i++){
          Arrays.fill(mat[i],false);
          mat[i][i] = true;  
        } 
        int start = 0 , maxLength = 0;
        for(int k = 1; k < len ; k++){
            for(int i = 0 ; i < len -k ; i++){
                if(s.charAt(i) != s.charAt(k+i)) continue;
                if(k == 1) 
                    mat[i][i+k] = true;
                else mat[i][i+k] = mat[i+1][i+k-1];
                if(mat[i][i+k]  && k > maxLength) {
                    maxLength = k;
                    start = i;
                }
            }
        }
        return s.substring(start,start + maxLength+1);
    }
}
