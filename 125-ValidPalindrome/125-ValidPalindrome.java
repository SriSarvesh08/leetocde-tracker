// Last updated: 7/8/2026, 3:36:59 PM
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j)
            if(s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }
}