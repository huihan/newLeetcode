public class Solution {
    public boolean isMatch(String s, String p) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        
        return isMatch_DP(s,0 , p ,0 );
    }
    public boolean isMatch_DP(String s, int index1 , String p ,int index2 )
    {
        int len1 = s.length(),len2 = p.length();
        if( index2 >= len2) return index1 == len1; 
        Boolean ret = false;
        if(index2 < len2 -1) if(p.charAt(index2+1) == '*') ret = true;
        
        if(index1 >= len1) return ret? isMatch_DP(s,index1, p , index2+2):false; 
        
        if(s.charAt(index1) == p.charAt(index2) || p.charAt(index2) == '.')
            return (ret && isMatch_DP(s,index1 , p , index2+2))||(!ret &&isMatch_DP(s,index1+1 , p , index2+1))||(ret && isMatch_DP(s,index1+1 , p , index2)) ;
    
        return (ret && isMatch_DP(s,index1 , p , index2+2)) ;
    }
}
