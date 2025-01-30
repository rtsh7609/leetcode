class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
        int countCap = 0;
        for(int i=0; i<len; i++)
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                countCap++;
        
        return ((countCap == 0) || (countCap == len) || 
                (countCap == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90));
    }
}