class Solution {
    public static int BinarySearch(int nums[],int low,int high,int target){
    
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            // if there are duplicates then no need to do anything
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) 
            {
              low++;
              high--;
              continue;
             }
            //  check if it is left half sorted
            else if(nums[low]<=nums[mid]){
                //  check if ele lies in the left half sorted part
              if(target>=nums[low] && nums[mid]>=target){
               high=mid-1;
              }
              else{
                low=mid+1;
              } 
            }
             //  check if it is right half sorted
            else{
            //  check if ele lies in the right half sorted part
                if(target>=nums[mid] && target<=nums[high]){
                  low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        
        }
        return -1;
    }
    public boolean search(int[] nums, int target) {
    int low=0,high=nums.length-1;
    int res=BinarySearch(nums,low,high,target);
    return res==-1 ? false :true;
    }
}