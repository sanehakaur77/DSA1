class Solution {
    public int missingNumber(int[] nums) {
        // we will just substract the totalSum from the sum of the natural numbers formula i.e sum of the length  of the n
        // array length
        int totalSum=0;
        for(int a:nums){
            totalSum+=a;
        }
        int n=nums.length;
        int sum=(n*(n+1))/2;
        return sum-totalSum;

    }
}