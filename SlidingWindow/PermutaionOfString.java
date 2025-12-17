class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Freq[]=new int[26];
        int s2Freq[]=new int[26];
        int left=0;
        for(char ch:s1.toCharArray()){
            s1Freq[ch-'a']++;
        }
        for(int right=0;right<s2.length();right++){
           
            char RightChar=s2.charAt(right);
            s2Freq[RightChar-'a']++;
            while(right-left+1>=s1.length()){
                if(Arrays.equals(s1Freq,s2Freq)){
                    return true;
                }
                char LeftChar=s2.charAt(left);
                s2Freq[LeftChar-'a']--;
                left++;
            }
        }
        return false;
    }
}