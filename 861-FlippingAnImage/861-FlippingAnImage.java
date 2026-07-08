// Last updated: 7/8/2026, 3:34:43 PM
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        int row = A.length;
        int col = A[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<(col+1)/2;j++){
                int temp = A[i][j];
                A[i][j] = A[i][col-1-j]^1;
                A[i][col-1-j]= temp^1;

            }
        }
        return A;
    }
}
