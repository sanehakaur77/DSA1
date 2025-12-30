class Solution {
    public static int  findFirstOccurence(int [] arr,int low,int high,int   target){
        int ans=-1;
     while(low<=high){
int mid=low+(high-low)/2;
 if(arr[mid]==target){
  high=mid-1;//  for seraching to  left
ans=mid;
}
else if(arr[mid]<target){
    low=mid+1;
}
else{
    high=mid-1;
}

     }
     return  ans;

    }
       public static int findLastOccurence(int [] arr,int low,int high,int   target){
        int ans=-1;
     while(low<=high){
int mid=low+(high-low)/2;
 if(arr[mid]==target){
low=mid+1; //  for moving to the right
ans=mid;
}
else if(arr[mid]<target){
    low=mid+1;
}
else{
    high=mid-1;
}

     }
     return ans;

    }
    public int[] searchRange(int[] nums, int target) {
    
    int low=0;
    int high=nums.length-1;
    int first=findFirstOccurence(nums,low,high,target);
    int Last=findLastOccurence(nums,low,high,target);
    return new int[]{first,Last};
   
        
    }
}