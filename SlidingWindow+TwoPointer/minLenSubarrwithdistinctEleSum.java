class Solution {
    public int minLength(int[] nums, int k) {
        //  question no 3795
         HashMap<Integer,Integer> map=new HashMap<>();
         int left=0;
         int distinctSum=0;
         int minLen=Integer.MAX_VALUE;
         for(int right=0;right<nums.length;right++){
            //  add the current ele into sum from right if its freq is 1
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
          if(map.get(nums[right])==1){
           distinctSum+=nums[right];
          }
          //when the sum becomes >=k then update minlen and shrink window
          while(distinctSum>=k){
            minLen=Math.min(right-left+1,minLen);
            map.put(nums[left],map.get(nums[left])-1);
            if(map.get(nums[left])==0){
                 distinctSum-=nums[left];
                map.remove(nums[left]);
            }
            left++;

          }
         }
         return minLen==Integer.MAX_VALUE ? -1 : minLen;
        
    }
}