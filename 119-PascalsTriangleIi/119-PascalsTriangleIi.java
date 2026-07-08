// Last updated: 7/8/2026, 3:37:11 PM
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        long ans = 1;
        res.add(1);
        for(int i = 1; i <= rowIndex; i++){
            ans *= (rowIndex - i + 1);
            ans /= i;
            res.add((int) ans);
        }
        return res;
    }
}