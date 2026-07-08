// Last updated: 7/8/2026, 3:34:45 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if((s.length()) != (goal.length()))
        return false;
        return(s+s).contains(goal);
    }
    
}