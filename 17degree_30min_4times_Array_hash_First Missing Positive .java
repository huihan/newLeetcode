public class Solution {
    public int firstMissingPositive(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int len = A.length;   
        if(len == 0) return 1;
        for(int i = 0 ; i < len ; i++) {
            A[i] = A[i] <= 0?len+1 : A[i];
        }
        for(int a : A){
            if(Math.abs(a) <=  len){
              A[Math.abs(a)-1] = -Math.abs(A[Math.abs(a)-1]);  
            } 
        }
        for(int i = 0 ;i < len ; i++){
            if(A[i] > 0 ) return i+1;
        }
        return len+1;
    }
}
