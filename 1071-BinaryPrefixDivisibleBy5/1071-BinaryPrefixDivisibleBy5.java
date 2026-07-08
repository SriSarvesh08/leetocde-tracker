// Last updated: 7/8/2026, 3:34:36 PM
class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int val = 0;
        for(int ele : nums){
            val = ((val*2)+ele)%5;
            ans.add(val==0);
        }
        return  ans;
    }
}