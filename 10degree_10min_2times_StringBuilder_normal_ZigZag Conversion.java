public class Solution {
    public String convert(String s, int nRows) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(s.length() < 3 || nRows < 2) return s;
        ArrayList<StringBuilder> arr = new ArrayList<StringBuilder>();
        for(int i = 0 ; i < nRows ; i++) arr.add(new StringBuilder());
        int curRow = 0 ; 
        boolean direct = true;
        for(int i = 0 ; i < s.length() ; i++){
            arr.get(curRow).append(s.charAt(i));
            curRow = direct? curRow+1 : curRow-1;
            if(curRow >= nRows){
                curRow = nRows -2;
                direct = false;
            }
            if(curRow < 0){
                curRow = 1;
                direct = true;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0 ;i < arr.size() ; i++) res.append(arr.get(i));
        return res.toString();
    }
}
