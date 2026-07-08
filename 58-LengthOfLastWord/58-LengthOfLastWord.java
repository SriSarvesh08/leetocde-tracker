// Last updated: 7/8/2026, 3:38:48 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}