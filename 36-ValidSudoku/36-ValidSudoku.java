// Last updated: 7/8/2026, 3:39:23 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
       for(int i = 0; i<9; i++){
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
       
        for (int j = 0; j < 9;j++){
            if(board[i][j]!='.' && !rows.add(board[i][j]))
                return false;
            if(board[j][i]!='.' && !columns.add(board[j][i]))
                return false;            
         }
       }
        
       for(int i = 0; i < 7;i += 3) {
           for(int j = 0;j < 7; j += 3){
               HashSet<Character> cube = new HashSet<Character>();
               for(int k = 0;k < 9;k++){
                    if(board[i + k/3][j + k % 3]!='.' && !cube.add(board[i + k/3][j + k % 3]))
                    return false;
               }
           }
       }
        
     return true;
    }        
}