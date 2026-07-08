// Last updated: 7/8/2026, 3:34:20 PM
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = 0;
        int m = 0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(n<count){
                n = count;
                m= i;
            }
        }
        return new int[]{m,n};
    }
}