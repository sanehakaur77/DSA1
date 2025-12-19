class Solution {
    public int majorityElement(int[] nums) {
    //   int count = 0;
    //     int candidate = 0;

    //     for (int num : nums) {
    //         if (count == 0) {
    //             candidate = num;
    //         }
    //         if (num == candidate) {
    //             count++;
    //         } else {
    //             count--;
    //         }
    //     }

    //     // candidate now is the majority element
    //     return candidate;
    // Moore's Voting Algorithm
      int count=0;
      int ele=0;
      for(int i=0;i<nums.length;i++){
         if(count==0){
            count=1;
            ele=nums[i];
         }
         else if(nums[i]==ele){
            count++;
         }
         else{
            count--;
         }
      }
      return ele;
    }
}