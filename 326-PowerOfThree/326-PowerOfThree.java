// Last updated: 7/8/2026, 3:35:31 PM
class Solution {
    public boolean isPowerOfThree(int n) {
         if(n <= 0) return false;
        if(n == 1) return true;

        while(n % 3 == 0) {
            n /= 3;
            if(n == 1) return true;
        }
        return false;
    }
}