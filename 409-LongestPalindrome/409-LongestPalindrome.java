// Last updated: 7/8/2026, 3:35:02 PM
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans = 0 ;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                ans+=2;
                set.remove(c);
            }
            else set.add(c);
        }
        if(set.size()>0) ans ++;
        return ans ;
    }
}