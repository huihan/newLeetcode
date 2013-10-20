public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int row = matrix.length;
        if(row == 0 ) return arr;
        int col = matrix[0].length;
        if(col == 0 ) return arr;
        int circle = Math.min(row,col);
        circle = circle/2 + circle%2;
        for(int i= 0 ; i < circle ; i++){
            printCircle(matrix,i,arr);
        }
        return arr;1
    }
    public void printCircle(int[][] m , int cir , ArrayList<Integer> arr){
        int row = m.length; 
        int col = m[0].length;
        for(int i = cir ; i < col -cir ; i++) 
            arr.add(m[cir][i]); 
        for(int j = cir+1 ; j< row-1-cir ; j++) 
            arr.add(m[j][col-1-cir]); 
        if(cir < row-1-cir )
        for(int i = col-1-cir ; i>= cir ; i--)
            arr.add(m[row-1-cir][i]); 
        if(cir < col-1-cir )
        for(int j = row-2-cir ; j>cir ; j--) 
            arr.add(m[j][cir]); 
    }
}
