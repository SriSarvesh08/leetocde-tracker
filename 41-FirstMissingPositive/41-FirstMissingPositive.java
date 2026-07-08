// Last updated: 7/8/2026, 3:39:16 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int smallest = 1;
        for (int num : nums) {
            if (num == smallest) {
                smallest++;
            }
        }
        return smallest;
    }
}