class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
       for(int i=n-1;i>=0;i--){
        // if last number is less than the 9 no need to carry
        if(digits[i]<9){
            digits[i]+=1;
            return digits;
        }
        //  if there are 9s  set to 0
        digits[i]=0;

       }
    //  if all the 999 
    int res[]=new int[digits.length+1];
    res[0]=1;
    return res;


        
    }
}