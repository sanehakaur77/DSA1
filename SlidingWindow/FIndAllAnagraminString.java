class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        int left=0;
        int k=p.length();
        if (s.length() < p.length()) return list ;
        //  for storing freq of the characterof the String P
        int FreqP[]=new int[26];
         //  for storing freq of the characterof the String S
        int FreqS[]=new int[26];
        for(char c:p.toCharArray()){
            FreqP[c-'a']++;
        }
        for(int right=0;right<s.length();right++){
        //from the right side we will add the character and increase their freq 
         FreqS[s.charAt(right)-'a']++;
        //  ab dekhnge ki jab window ki length badi hai p ki length se 
        // tab left se window ko shrink karenge aur freq dec karenge left character ki
         if(right-left+1>p.length()){
           FreqS[s.charAt(left)-'a']--;
           left++;
         }
         // agar Anagram string of left string  apas me mil jayenge tohum  left cpointer  ko add karenge list me jiss se vi adnagram string strat horaho hai
         if(Arrays.equals(FreqS,FreqP)){
            list.add(left);
         }

        }
        return list;
        
    }
}