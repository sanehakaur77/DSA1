class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
    //   HashMap<Integer,Integer> map=new HashMap<>();
    //   int left=0;
    //   long sum=0;
    //   long maxSum=0;
    //   for(int right=0;right<nums.length;right++){
    //     map.put(nums[right],map.getOrDefault(nums[right],0)+1);
        
    //         sum+=nums[right];
        
    //       while(map.get(nums[right]) > 1 || right-left+1 > k){
    //         map.put(nums[left],map.get(nums[left])-1);
    //         sum-=nums[left];
    //         if(map.get(nums[left])==0){
    //             map.remove(nums[left]);
    //         }
    //         left++;
    //       }
    //       if(map.size()==k && map.size()==k){
    //         maxSum=Math.max(maxSum,sum);
    //       }

    //   }
    //   return maxSum;
    // Approach 2 using HashSet
    HashSet<Integer> set =new HashSet<>();
    int left=0;
    long sum=0;
    long maxSum=0;
    for(int right=0;right<nums.length;right++){
        while(set.contains(nums[right])){
            set.remove(nums[left]);
            sum=sum-nums[left];
            left++;
        }
        set.add(nums[right]);
        sum+=nums[right];
        if(right-left+1==k){
            maxSum=Math.max(maxSum,sum);
            set.remove(nums[left]);
            sum-=nums[left];
            left++;
        }
    }
    return maxSum;
    }
}
