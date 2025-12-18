class Solution {
    public static int atmost(int[] nums,int k){
        int oddCount=0;
        int left=0;
        int count=0;
        for(int right=0;right<nums.length;right++){
            // l=2 r=4
            if(nums[right]%2==1){
                oddCount++;//3
            }
            while(oddCount>k){ //3>2 true
                if (nums[left] % 2 == 1) { 
                oddCount--; //  
                }
                left++; 
            }
            count+=(right-left+1);//1+2+3+4+4=14-(1+2+3+3+3)
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}