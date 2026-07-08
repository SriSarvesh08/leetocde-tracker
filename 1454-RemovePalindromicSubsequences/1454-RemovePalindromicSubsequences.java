// Last updated: 7/8/2026, 3:34:33 PM
class Solution {
    public int removePalindromeSub(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return 2;
            left++;
            right--;
        }
        return 1;
    }
}