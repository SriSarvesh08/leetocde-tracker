// Last updated: 7/8/2026, 3:34:59 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0) nums[idx]*=-1;
        }
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
            if(nums[i]>0) res.add(i+1);
        return res;
    }
}