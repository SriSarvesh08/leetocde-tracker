// Last updated: 7/8/2026, 3:39:36 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        int i =0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] !=val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}