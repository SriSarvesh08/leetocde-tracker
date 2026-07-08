// Last updated: 7/8/2026, 3:38:56 PM
class Solution {
    
     public int totalNQueens(int n) {
        int[][] matrix = new int[n][n];    
        return doFill(0, matrix);
     }
    
     private int doFill(int QNo, int[][] matrix) {
        if(QNo == matrix.length) {
            return 1;
        }
        int count = 0; 
        for(int col=0; col<matrix[QNo].length; col++) {
            if(matrix[QNo][col] == 0) {
                if(isValid(QNo, col, matrix)) {
                    matrix[QNo][col] = 1;
                    count += doFill(QNo+1, matrix);
                    matrix[QNo][col] = 0;
                }
            }
        }
        return count;
    }
    
    private boolean isValid(int row, int col, int[][] matrix) {
        for(int r= row-1; r>=0 ; r--) {
            if(matrix[r][col]==1) {
                return false;
            }
        }
          for(int c=col-1, r = row-1; c>=0 && r>=0; c--, r--){
             if(matrix[r][c]==1) {
                return false;
            }
        }
        for(int c=col+1, r = row-1; c<matrix[0].length && r>=0; c++, r--){
             if(matrix[r][c]==1) {
                return false;
            }
        }
        return true;
        
    }
}