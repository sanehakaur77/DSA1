class Solution {
    public static void reverse(int arr[],int start,int end){
       
       while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
         start++;
         end--;
       }
       return;
    }
    public void rotate(int[] nums, int k) {

        int n=nums.length;
        
        k=k%n;
       //  step 1 reverse an entire array
       reverse(nums,0,n-1);
       //  step2 reverse first k elements
       reverse(nums,0,k-1);
       //  step 3 reverse kth element to last element
       reverse(nums,k,n-1);
      
      
     }
    }