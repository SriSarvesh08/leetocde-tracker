// Last updated: 7/8/2026, 3:34:29 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        
        int n=0;
        int m=0;
        for(int i=0;i<mat.length;i++){
           m= m + mat[i][i];
           m= m + mat[i][mat.length-1-i];
        }
        if(mat.length%2==1){
            m =m-mat[mat.length/2][mat.length/2];
        }
         return m;
    }
    
}