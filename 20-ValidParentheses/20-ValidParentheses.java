// Last updated: 7/8/2026, 3:39:46 PM
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if (c == ')' || c == '}' || c == ']') {
                
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            } else {
            
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));       
        System.out.println(solution.isValid("()[]{}"));   
        System.out.println(solution.isValid("(]"));       
        System.out.println(solution.isValid("([)]"));     
        System.out.println(solution.isValid("{[]}"));     
    }
}