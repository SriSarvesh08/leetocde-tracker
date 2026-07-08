// Last updated: 7/8/2026, 3:34:31 PM
class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];

        }
        return nums;
        
    }
}