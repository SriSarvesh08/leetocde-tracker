// Last updated: 7/8/2026, 3:40:02 PM
class Solution {
    public boolean isPalindrome(int x){
        if(x<0) return false;
        int rev=0,temp=x;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp/=10;
        }
        return rev==x;
    }
}