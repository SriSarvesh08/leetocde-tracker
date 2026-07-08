// Last updated: 7/8/2026, 3:36:24 PM
class Solution {
    public String reverseWords(String s) {
         String[] words = s.trim().split("\\s+");
         String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];
            if (i != 0) {
                result = result + " ";
            }
        }
        return result;
    }
}