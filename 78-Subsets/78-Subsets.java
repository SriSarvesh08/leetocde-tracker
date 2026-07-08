// Last updated: 7/8/2026, 3:38:18 PM
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(res,new ArrayList<>(),nums,0);
        return res;
    }
    void backtrack(List<List<Integer>> res,List<Integer> temp,int[] nums,int start){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(res,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}