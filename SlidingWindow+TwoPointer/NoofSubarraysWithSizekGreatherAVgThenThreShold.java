class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int left=0;
        int count=0;
        for(int right=0;right<arr.length;right++){
            int avg=0;
           sum=sum+arr[right];
           // agar window ka size greater than k to window is 
           // invalid  and then we have to shrok the window
            
           while(right-left+1>k){
            sum-=arr[left];
            left++;
           }
           // agar windows size is equal to k then we have to 
           //calculate avg 
           if(right-left+1==k){
           avg=(sum/k);
           // if avg is greater than or equal to the threshold
           // we have to icrement the count
           if(avg>=threshold){
            count++;
           }
           }
        }
        return count;
       
    }
}