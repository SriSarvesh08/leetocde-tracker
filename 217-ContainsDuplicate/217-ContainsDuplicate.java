// Last updated: 7/8/2026, 3:35:54 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums)
            if(!set.add(n)) return true;
        return false;
    }
}