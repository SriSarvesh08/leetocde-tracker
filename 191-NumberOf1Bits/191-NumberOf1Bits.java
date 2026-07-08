// Last updated: 7/8/2026, 3:36:01 PM
class Solution {
    public int hammingWeight(int n) {
        int count=0;
      while(n!=0){
        if(((n>>0)&1)==1)
        count++;
        n=n>>1;
      }
      return count;
    }
}