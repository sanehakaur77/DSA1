class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0;
        HashSet<Integer> set =new HashSet<>();
         for(int right=0;right<nums.length;right++){
            while(set.contains(nums[right])){
                 if(Math.abs(right-left)<=k){
                    return true;
                 }
                 set.remove(nums[left]);
                 left++;    
            }
            set.add(nums[right]);
         }
         return false;
    }
}