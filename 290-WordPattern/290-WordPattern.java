// Last updated: 7/8/2026, 3:35:34 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false; 
        }
        String[] charToWord = new String[256]; 
        char[] wordToChar = new char[words.length];

        for (int i = 0; i < pattern.length(); i++) {
            char currentChar = pattern.charAt(i);
            String currentWord = words[i];
            if (charToWord[currentChar] == null) {
                charToWord[currentChar] = currentWord;
            } else {
                if (!charToWord[currentChar].equals(currentWord)) {
                    return false; 
                }
            }

           
            int wordIndex = -1;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(currentWord)) {
                    wordIndex = j;
                    break;
                }
            }

            if (wordIndex != -1) {
                if (wordToChar[wordIndex] == '\u0000') { 
                    wordToChar[wordIndex] = currentChar;
                } else {
                    if (wordToChar[wordIndex] != currentChar) {
                        return false; 
                    }
                }
            }
        }

        return true; 
    }
}

  