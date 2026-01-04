import java.util.*;
class one {
    public static void main(String args[]){
        //  Check if Permutation is Substring gfg question
       String txt = "geeks", pat = "eke";
       int patFreq[]=new int[26];
       int textFreq[]=new int[26];
       for(char ch:pat.toCharArray()){
        patFreq[ch-'a']++;
       }
       System.out.println(Arrays.toString(patFreq));
       boolean flag=false;
         int left=0;
         for(int right=0;right<txt.length();right++){
            textFreq[txt.charAt(right)-'a']++;
            while(right-left+1 >pat.length()){
                textFreq[txt.charAt(left)-'a']--;
                left++;
            }

            if(right-left+1==pat.length()){
                if(Arrays.equals(textFreq,patFreq)){
                    flag=true;
                    break;
                }
            }
         }
         System.out.println(flag);
       

    }
}