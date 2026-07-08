// Last updated: 7/8/2026, 3:38:15 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int c = 1;
        for(int i=1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                c++;
            }else{
                c = 1;
            }

            if (c <= 2){
                nums[k] = nums[i];
                k++;
            }
        }  

        return k;
    }
}