// Last updated: 7/8/2026, 3:35:15 PM
class Solution {
    public int firstUniqChar(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j) && i!=j){
                    count++;
                    break;
                }
            }  
            if(count==0){
                return i;
            }else{
                count =0;
            }        
        }
        return -1;
        
    }
}