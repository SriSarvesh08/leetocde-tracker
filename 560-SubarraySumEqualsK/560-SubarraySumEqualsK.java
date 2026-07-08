// Last updated: 7/8/2026, 3:34:49 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       map.put(0,1);
       int sum=0, count= 0;

       for(int num: nums){
        sum += num;
        count += map.getOrDefault(sum-k,0);
        map.put(sum,map.getOrDefault(sum,0)+1);
       }
       return count;
    }
}