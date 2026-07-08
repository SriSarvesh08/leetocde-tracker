// Last updated: 7/8/2026, 3:37:13 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();
        
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= rowNum; j++) {
                if (j == 0 || j == rowNum) {
                    row.add(1);
                } else {
                    int sum = triangle.get(rowNum - 1).get(j - 1) 
                            + triangle.get(rowNum - 1).get(j);
                    row.add(sum);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}