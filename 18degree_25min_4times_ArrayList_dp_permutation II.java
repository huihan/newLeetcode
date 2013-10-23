public class Solution {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        solve( num , 0 ,res);
        return  res;
    }
    public void solve(int[] num , int index , ArrayList<ArrayList<Integer>> res){
         if(index == num.length -1) {
             ArrayList<Integer> temlist = new ArrayList<Integer>();
             for(int a:num)
                temlist.add(a);
             res.add(temlist);
             return ;
         }
         for(int i = index ;i < num.length ; i++){
               if(canSwap(num , index , i)) {
                   solve(num, index+1,res);
                   swap(num , index , i);
               }
         }
         return;
    }
    public boolean canSwap(int[] num , int i , int j )
    {
        if( i == j ) return true; 
        for(int k = i ; k <j ; k++ ) 
            if(num[k] == num[j]) return false;
        swap(num , j , i);
        return true;
    }
    public void swap(int[] num , int i , int j ){
         int tem = num[i];
        num[i]= num[j];
        num[j] = tem;
    }
}
