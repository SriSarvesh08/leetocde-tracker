// Last updated: 7/8/2026, 3:38:55 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0],max=nums[0];
        for(int i=1;i<nums.length;i++){
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        return max;
    }
}