// Last updated: 7/8/2026, 3:35:41 PM
class Solution {
    public boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}