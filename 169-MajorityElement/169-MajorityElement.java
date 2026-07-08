// Last updated: 7/8/2026, 3:36:09 PM
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return(nums[nums.length / 2]);
    }
}