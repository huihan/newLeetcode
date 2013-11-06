public class Solution {
    public void setZeroes(int[][] matrix) { 
        boolean rowZero = false, colZero = false;
        int row = matrix.length;
        if(row <=0 ) return ;
        int col = matrix[0].length;
        if(col <=0) return ;
        for(int a : matrix[0]) if(a == 0) rowZero = true;
        for(int j = 0 ; j < matrix.length ; j++) 
            if(matrix[j][0]== 0 ) colZero = true; 
        for(int i = 1 ;i < row ; i++)
            for(int j = 1 ; j  < col ; j++) 
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                } 
        for(int i = 1 ;i < row ; i++)
            for(int j = 1 ; j  < col ; j++) 
                if(matrix[i][0] == 0 || matrix[0][j]==0) matrix[i][j] = 0; 
        for(int i = 0 ; i < row ; i++)
            matrix[i][0] = colZero? 0 : matrix[i][0];
        for(int j = 0 ; j < col ; j++)
            matrix[0][j] = rowZero? 0: matrix[0][j];
        
    }
}
