// Last updated: 7/8/2026, 3:39:35 PM
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++) {
            if(i+needle.length() > haystack.length()) {
                return -1;
            }
            for(int j=0;j<needle.length() && i+j<haystack.length();j++) {
                if(haystack.charAt(i+j) != needle.charAt(j)) {
                    break;
                } else if(j==needle.length()-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}