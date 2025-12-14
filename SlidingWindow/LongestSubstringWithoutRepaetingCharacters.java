class Solution {
    public int lengthOfLongestSubstring(String s) {
         HashSet<Character> set =new HashSet<>();
         int left=0;
         int maxLen=Integer.MIN_VALUE;
         for(int right=0;right<s.length();right++)
         {
          
           char rightChar=s.charAt(right); 
            while(set.contains(rightChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(rightChar);
            maxLen=Math.max(maxLen,right-left+1);
         }  
         return maxLen==Integer.MIN_VALUE ? 0 : maxLen;

    }
}