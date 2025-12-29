class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxFreq=0;
        int maxLen=0;
        int FreqArr[]=new int[26];
        for(int right=0;right<s.length();right++){
        FreqArr[s.charAt(right)-'A']++;
        //check which character has maxFreq
        maxFreq=Math.max(maxFreq,FreqArr[s.charAt(right)-'A']);
        while((right-left+1)-maxFreq >k){
            FreqArr[s.charAt(left)-'A']--;
            left++;
        }
        maxLen=Math.max(maxLen,right-left+1);

        }
        return maxLen;
    }
}