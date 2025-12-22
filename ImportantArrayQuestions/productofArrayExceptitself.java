class Solution {
    public int[] productExceptSelf(int[] nums) {
      int res[]=new int[nums.length];
      int n=nums.length;
       res[0]=1;
       // prefix product
      for(int i=1;i<nums.length;i++){
       res[i]=res[i-1]*nums[i-1];
      }
      //suffix Product
      int suffix=1;
      for(int i=n-1;i>=0;i--){
        res[i]=res[i]*suffix;
        suffix*=nums[i];
      }
      return res;
    }
}
