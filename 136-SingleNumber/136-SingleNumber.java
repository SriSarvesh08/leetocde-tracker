// Last updated: 7/8/2026, 3:36:43 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int n:nums) res^=n;
        return res;
    }
}